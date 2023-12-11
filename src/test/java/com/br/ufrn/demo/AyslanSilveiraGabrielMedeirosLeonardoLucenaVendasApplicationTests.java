package com.br.ufrn.demo;

import org.junit.jupiter.api.Test;
<<<<<<< Updated upstream
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AyslanSilveiraGabrielMedeirosLeonardoLucenaVendasApplicationTests {
=======
import org.mockito.Mockito;
//import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

//@SpringBootTest
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
	void contextLoads() {
	}

}
