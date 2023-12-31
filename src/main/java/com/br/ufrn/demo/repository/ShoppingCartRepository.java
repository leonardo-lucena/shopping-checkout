package com.br.ufrn.demo.repository;

import com.br.ufrn.demo.model.ShoppingCart;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, UUID> {
}
