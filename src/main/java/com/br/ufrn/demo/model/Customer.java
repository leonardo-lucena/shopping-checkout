package com.br.ufrn.demo.model;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.*;

import java.time.LocalDateTime;

import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customers")
@SQLDelete(sql = "UPDATE customers SET deleted = true, delete_date_time = NOW() WHERE id=?")
@FilterDef(name = "deletedCustomerFilter", parameters = @ParamDef(name = "isDeleted", type = boolean.class))
@Filter(name = "deletedCustomerFilter", condition = "deleted = :isDeleted")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    @OneToOne
    @JoinColumn(name = "id_shopping_cart")
    private ShoppingCart user_shopping_cart;

    private Boolean deleted = Boolean.FALSE;
    private LocalDateTime delete_date_time;
    //add create and update timestamps
    @CreationTimestamp
    private LocalDateTime created_date_time;
    @UpdateTimestamp
    private LocalDateTime updated_date_time;

}
