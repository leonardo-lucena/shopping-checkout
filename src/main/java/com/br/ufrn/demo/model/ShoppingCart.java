package com.br.ufrn.demo.model;

import jakarta.persistence.*;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.*;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "shopping_carts")
// safe delete annotations
@SQLDelete(sql = "UPDATE shopping_carts SET deleted = true, delete_date_time = NOW() WHERE id=?")
@FilterDef(name = "deletedShoppingCartFilter", parameters = @ParamDef(name = "isDeleted", type = boolean.class))
@Filter(name = "deletedShoppingCartFilter", condition = "deleted = :isDeleted")
public class ShoppingCart {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @OneToOne
    @JoinColumn(name = "id_customer")
    private Customer costumer;

    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
    List<Product> products;

    private float total_value;
    private float total_weight;
    private float cartDiscount;
    private float shippingDiscount;
    private float finalValue;

    // delete, create, update timestamps
    private Boolean deleted = Boolean.FALSE;
    private String delete_date_time;
    @CreationTimestamp
    private String created_date_time;
    @UpdateTimestamp
    private String updated_date_time;

    // Calcula a quantidade de itens no carrinho
    public int getProductCount() {
        return this.products.size();
    }

    // calcula o peso total do carrinho
    public float getTotalWeight() {
        float totalWeight = 0;
        for (Product product : this.products) {
            totalWeight += product.getWeight();
        }
        return totalWeight;
    }

    // verifica se existe um item repetido mais de 2x
    public boolean hasDuplicateProduct() {
        Map<String, Integer> productFrequency = new HashMap<>();
        for (Product product : this.products) {
            String productName = product.getName();
            if (!productFrequency.containsKey(productName)) {
                productFrequency.put(productName, 1);
            } else {
                int frequency = productFrequency.get(productName);
                if (frequency >= 2) {
                    return true;
                } else {
                    productFrequency.put(productName, frequency + 1);
                }
            }
        }
        return false;
    }

    // calcula o valor total do carrinho
    public float getTotalValue() {
        float totalValue = 0;
        for (Product product : this.products) {
            totalValue += product.getValue();
        }
        return totalValue;
    }

    // Calcula o valor do frete
    public float calculateShipping() {
        float totalWeight = getTotalWeight();
        int itemCount = getProductCount();
        float shippingCost = 0;

        if (totalWeight > 50) {
            shippingCost = totalWeight * 7;
        } else if (totalWeight > 10) {
            shippingCost = totalWeight * 4;
        } else if (totalWeight > 2) {
            shippingCost = totalWeight * 2;
        }

        if (itemCount > 5) {
            shippingCost += 10;
        }

        return shippingCost;
    }

    // calcula o desconto do carrinho
    public void calculateCartDiscount() {
        float totalValueBeforeDiscount = getTotalValue();

        if (totalValueBeforeDiscount > 1000) {
            this.cartDiscount = totalValueBeforeDiscount * 0.2f; // 20% discount
        } else if (totalValueBeforeDiscount > 500) {
            this.cartDiscount = totalValueBeforeDiscount * 0.1f; // 10% discount
        } else {
            this.cartDiscount = 0;
        }
    }

    // calcula o desconto do frete
    public void calculateShippingDiscount() {
        float shippingBeforeDiscount = calculateShipping();

        if (hasDuplicateProduct()) {
            this.shippingDiscount = shippingBeforeDiscount * 0.05f; // 5% discount
        } else {
            this.shippingDiscount = 0;
        }
    }

    // calcula o valor final aplicando os descontos
    public void calculateFinalValue() {
        this.finalValue = (getTotalValue() - this.cartDiscount) + (calculateShipping() - this.shippingDiscount);
    }
}
