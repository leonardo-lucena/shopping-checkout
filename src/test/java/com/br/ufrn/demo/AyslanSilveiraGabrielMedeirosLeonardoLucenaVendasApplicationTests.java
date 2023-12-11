package com.br.ufrn.demo;

import com.br.ufrn.demo.model.ShoppingCart;
import com.br.ufrn.demo.model.Product;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

// @SpringBootTest
class ShoppingCartTest {
	private ShoppingCart carrinho;
	private Product produto1;
	private Product produto2;

	@BeforeEach
	void setUp() {
		carrinho = new ShoppingCart();
		produto1 = Mockito.mock(Product.class);
		produto2 = Mockito.mock(Product.class);
	}

	@Test
	void testCalculateCartDiscount() {
		Mockito.when(produto1.getValue()).thenReturn(600.0f);
		Mockito.when(produto2.getValue()).thenReturn(600.0f);
		carrinho.setProducts(Arrays.asList(produto1, produto2));
		carrinho.calculateCartDiscount();
		assertEquals(240.0f, carrinho.getCartDiscount());
	}

	@Test
	void testCalculateShippingDiscount() {
		Mockito.when(produto1.getName()).thenReturn("Produto1");
		Mockito.when(produto2.getName()).thenReturn("Produto1");
		Mockito.when(produto1.getWeight()).thenReturn(60.0f);
		Mockito.when(produto2.getWeight()).thenReturn(60.0f);
		carrinho.setProducts(Arrays.asList(produto1, produto2));
		carrinho.calculateShippingDiscount();
		assertEquals(0.0f, carrinho.getShippingDiscount());
	}

	@Test
	void testCalculateFinalValue() {
		Mockito.when(produto1.getValue()).thenReturn(600.0f);
		Mockito.when(produto2.getValue()).thenReturn(600.0f);
		Mockito.when(produto1.getWeight()).thenReturn(60.0f);
		Mockito.when(produto2.getWeight()).thenReturn(60.0f);
		Mockito.when(produto1.getName()).thenReturn("Produto1");
		Mockito.when(produto2.getName()).thenReturn("Produto1");
		carrinho.setProducts(Arrays.asList(produto1, produto2));
		carrinho.calculateCartDiscount();
		carrinho.calculateShippingDiscount();
		carrinho.calculateFinalValue();
		assertEquals(1800.0f, carrinho.getFinalValue());
	}
}