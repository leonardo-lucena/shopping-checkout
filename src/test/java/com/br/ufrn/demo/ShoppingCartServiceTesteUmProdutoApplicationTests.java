package com.br.ufrn.demo;

import com.br.ufrn.demo.model.Product;
import com.br.ufrn.demo.model.ShoppingCart;
import com.br.ufrn.demo.repository.ShoppingCartRepository;
import com.br.ufrn.demo.service.ShoppingCartService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class ShoppingCartServiceTesteUmProdutoApplicationTests {
    ShoppingCartRepository repository = Mockito.mock(ShoppingCartRepository.class);
    ShoppingCartService service = new ShoppingCartService(repository);

    @Test
    public void testCheckout() {
        UUID id = UUID.randomUUID();

        Product produto1 = Mockito.mock(Product.class);
        Mockito.when(produto1.getValue()).thenReturn(500.0f);
        Mockito.when(produto1.getWeight()).thenReturn(2.0f);
        Mockito.when(produto1.getName()).thenReturn("Produto1");

        ShoppingCart cart = new ShoppingCart();
        cart.setProducts(Arrays.asList(produto1));
        carrinho1ItemPeso2Valor500(id, cart);
        // -----------------------

        Mockito.when(produto1.getValue()).thenReturn(501.0f);
        Mockito.when(produto1.getWeight()).thenReturn(2.0f);
        Mockito.when(produto1.getName()).thenReturn("produto1");
        carrinho1ItemPeso2Valor501(id, cart);
        // -----------------------

        Mockito.when(produto1.getValue()).thenReturn(1000.0f);
        Mockito.when(produto1.getWeight()).thenReturn(2.0f);
        Mockito.when(produto1.getName()).thenReturn("Produto1");
        carrinho1ItemPeso2Valor1000(id, cart);
        // -----------------------

        Mockito.when(produto1.getValue()).thenReturn(1001.0f);
        Mockito.when(produto1.getWeight()).thenReturn(2.0f);
        Mockito.when(produto1.getName()).thenReturn("Produto1");
        carrinho1ItemPeso2Valor1001(id, cart);
        // -----------------------

        Mockito.when(produto1.getValue()).thenReturn(500.0f);
        Mockito.when(produto1.getWeight()).thenReturn(3.0f);
        Mockito.when(produto1.getName()).thenReturn("Produto1");
        carrinho1ItemPeso3Valor500(id, cart);
        // -----------------------

        Mockito.when(produto1.getValue()).thenReturn(501.0f);
        Mockito.when(produto1.getWeight()).thenReturn(3.0f);
        Mockito.when(produto1.getName()).thenReturn("Produto1");
        carrinho1ItemPeso3Valor501(id, cart);
        // -----------------------

        Mockito.when(produto1.getValue()).thenReturn(1000.0f);
        Mockito.when(produto1.getWeight()).thenReturn(3.0f);
        Mockito.when(produto1.getName()).thenReturn("Produto1");
        carrinho1ItemPeso3Valor1000(id, cart);
        // -----------------------

        Mockito.when(produto1.getValue()).thenReturn(1001.0f);
        Mockito.when(produto1.getWeight()).thenReturn(3.0f);
        Mockito.when(produto1.getName()).thenReturn("Produto1");
        carrinho1ItemPeso3Valor1001(id, cart);
        // -----------------------

        Mockito.when(produto1.getValue()).thenReturn(500.0f);
        Mockito.when(produto1.getWeight()).thenReturn(11.0f);
        Mockito.when(produto1.getName()).thenReturn("Produto1");
        carrinho1ItemPeso11Valor500(id, cart);
        // -----------------------

        Mockito.when(produto1.getValue()).thenReturn(501.0f);
        Mockito.when(produto1.getWeight()).thenReturn(11.0f);
        Mockito.when(produto1.getName()).thenReturn("Produto1");
        carrinho1ItemPeso11Valor501(id, cart);
        // -----------------------

        Mockito.when(produto1.getValue()).thenReturn(1000.0f);
        Mockito.when(produto1.getWeight()).thenReturn(11.0f);
        Mockito.when(produto1.getName()).thenReturn("Produto1");
        carrinho1ItemPeso11Valor1000(id, cart);
        // -----------------------

        Mockito.when(produto1.getValue()).thenReturn(1001.0f);
        Mockito.when(produto1.getWeight()).thenReturn(11.0f);
        Mockito.when(produto1.getName()).thenReturn("Produto1");
        carrinho1ItemPeso11Valor1001(id, cart);
        // -----------------------

        Mockito.when(produto1.getValue()).thenReturn(500.0f);
        Mockito.when(produto1.getWeight()).thenReturn(51.0f);
        Mockito.when(produto1.getName()).thenReturn("Produto1");
        carrinho1ItemPeso51Valor500(id, cart);
        // -----------------------

        Mockito.when(produto1.getValue()).thenReturn(501.0f);
        Mockito.when(produto1.getWeight()).thenReturn(51.0f);
        Mockito.when(produto1.getName()).thenReturn("Produto1");
        carrinho1ItemPeso51Valor501(id, cart);
        // -----------------------

        Mockito.when(produto1.getValue()).thenReturn(1000.0f);
        Mockito.when(produto1.getWeight()).thenReturn(51.0f);
        Mockito.when(produto1.getName()).thenReturn("Produto1");
        carrinho1ItemPeso51Valor1000(id, cart);
        // -----------------------

        Mockito.when(produto1.getValue()).thenReturn(1001.0f);
        Mockito.when(produto1.getWeight()).thenReturn(51.0f);
        Mockito.when(produto1.getName()).thenReturn("Produto1");
        carrinho1ItemPeso51Valor1001(id, cart);
        // -----------------------
    }

    public void carrinho1ItemPeso2Valor500(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 500.0f;
        Float actual = service.checkout(id);
        assertEquals(expected, actual);
    }

    public void carrinho1ItemPeso2Valor501(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 450.9f;
        Float actual = service.checkout(id);
        assertEquals(expected, actual);
    }

    public void carrinho1ItemPeso2Valor1000(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 900.0f;
        Float actual = service.checkout(id);
        assertEquals(expected, actual);
    }

    public void carrinho1ItemPeso2Valor1001(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 800.8f;
        Float actual = service.checkout(id);
        assertEquals(expected, actual);
    }

    public void carrinho1ItemPeso3Valor500(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 506.0f;
        Float actual = service.checkout(id);
        assertEquals(expected, actual);
    }

    public void carrinho1ItemPeso3Valor501(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 456.9f;
        Float actual = service.checkout(id);
        assertEquals(expected, actual);
    }

    public void carrinho1ItemPeso3Valor1000(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 906.0f;
        Float actual = service.checkout(id);
        assertEquals(expected, actual);
    }

    public void carrinho1ItemPeso3Valor1001(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 806.8f;
        Float actual = service.checkout(id);
        assertEquals(expected, actual);
    }

    public void carrinho1ItemPeso11Valor500(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 544.0f;
        Float actual = service.checkout(id);
        assertEquals(expected, actual);
    }

    public void carrinho1ItemPeso11Valor501(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 494.9f;
        Float actual = service.checkout(id);
        assertEquals(expected, actual);
    }

    public void carrinho1ItemPeso11Valor1000(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 944.0f;
        Float actual = service.checkout(id);
        assertEquals(expected, actual);
    }

    public void carrinho1ItemPeso11Valor1001(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 844.8f;
        Float actual = service.checkout(id);
        assertEquals(expected, actual);
    }

    public void carrinho1ItemPeso51Valor500(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 857.0f;
        Float actual = service.checkout(id);
        assertEquals(expected, actual);
    }

    public void carrinho1ItemPeso51Valor501(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 807.9f;
        Float actual = service.checkout(id);
        assertEquals(expected, actual);
    }

    public void carrinho1ItemPeso51Valor1000(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 1257.0f;
        Float actual = service.checkout(id);
        assertEquals(expected, actual);
    }

    public void carrinho1ItemPeso51Valor1001(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 1157.8f;
        Float actual = service.checkout(id);
        assertEquals(expected, actual);
    }
}
