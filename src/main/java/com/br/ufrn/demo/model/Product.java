package com.br.ufrn.demo.model;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import org.hibernate.annotations.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
@SQLDelete(sql = "UPDATE products SET deleted = true, delete_date_time = NOW() WHERE id=?")
@FilterDef(name = "deletedProductFilter", parameters = @ParamDef(name = "isDeleted", type = boolean.class))
@Filter(name = "deletedProductFilter", condition = "deleted = :isDeleted")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private Float value;
    private Float weight;
    private Boolean deleted = Boolean.FALSE;
    private LocalDateTime delete_date_time;
    @CreationTimestamp
    private LocalDateTime created_date_time;
    @UpdateTimestamp
    private LocalDateTime updated_date_time;
}
