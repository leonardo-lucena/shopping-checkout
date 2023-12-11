package com.br.ufrn.demo;

import com.br.ufrn.demo.model.ShoppingCart;
import com.br.ufrn.demo.model.Product;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;<<<<<<<Updated upstream
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
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
	void testGetProductCount() {
		carrinho.setProducts(Arrays.asList(produto1, produto2));
		assertEquals(2, carrinho.getProductCount());
	}

	@Test
	void testGetTotalWeight() {
		Mockito.when(produto1.getWeight()).thenReturn(2.0f);
		Mockito.when(produto2.getWeight()).thenReturn(3.0f);
		carrinho.setProducts(Arrays.asList(produto1, produto2));
		assertEquals(5.0f, carrinho.getTotalWeight());
	}

	@Test
	void testHasDuplicateProduct() {
		Mockito.when(produto1.getName()).thenReturn("Produto1");
		Mockito.when(produto2.getName()).thenReturn("Produto1");
		carrinho.setProducts(Arrays.asList(produto1, produto2));
		assertFalse(carrinho.hasDuplicateProduct());
	}

	@Test
	void testGetTotalValue() {
		Mockito.when(produto1.getValue()).thenReturn(100.0f);
		Mockito.when(produto2.getValue()).thenReturn(200.0f);
		carrinho.setProducts(Arrays.asList(produto1, produto2));
		assertEquals(300.0f, carrinho.getTotalValue());
	}

	@Test
	void testCalculateShipping() {
		Mockito.when(produto1.getWeight()).thenReturn(60.0f);
		Mockito.when(produto2.getWeight()).thenReturn(60.0f);
		carrinho.setProducts(Arrays.asList(produto1, produto2));
		assertEquals(840.0f, carrinho.calculateShipping());
	}
=======
import org.mockito.Mockito;
// import org.springframework.boot.test.context.SpringBootTest;

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
>>>>>>> Stashed changes

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