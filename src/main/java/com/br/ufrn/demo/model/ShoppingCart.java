package com.br.ufrn.demo.model;

import jakarta.persistence.*;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.*;

import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "shopping_carts")
//safe delete annotations
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

    private Float total_value;
    private Float total_weight;

    //delete, create, update timestamps
    private Boolean deleted = Boolean.FALSE;
    private String delete_date_time;
    @CreationTimestamp
    private String created_date_time;
    @UpdateTimestamp
    private String updated_date_time;
}
