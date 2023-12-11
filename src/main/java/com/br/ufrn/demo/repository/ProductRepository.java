package com.br.ufrn.demo.repository;

import com.br.ufrn.demo.model.Product;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, UUID> {
}
