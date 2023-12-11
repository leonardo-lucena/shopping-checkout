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

public class ShoppingCartServiceTesteCincoProdutosComRepeticaoApplicationTests {
    ShoppingCartRepository repository = Mockito.mock(ShoppingCartRepository.class);
    ShoppingCartService service = new ShoppingCartService(repository);

    @Test
    public void testCheckout() {
        UUID id = UUID.randomUUID();

        // Criar objetos mockados usando o Mockito
        Product produto1 = Mockito.mock(Product.class);
        Mockito.when(produto1.getValue()).thenReturn(100.0f);
        Mockito.when(produto1.getWeight()).thenReturn(0.25f);
        Mockito.when(produto1.getName()).thenReturn("Produto1");

        // O produto 2 foi repetido
        /* Product produto2 = Mockito.mock(Product.class);
        Mockito.when(produto2.getValue()).thenReturn(100.0f);
        Mockito.when(produto2.getWeight()).thenReturn(0.25f);
        Mockito.when(produto2.getName()).thenReturn("Produto2"); */

        Product produto3 = Mockito.mock(Product.class);
        Mockito.when(produto3.getValue()).thenReturn(100.0f);
        Mockito.when(produto3.getWeight()).thenReturn(0.25f);
        Mockito.when(produto3.getName()).thenReturn("Produto3");

        Product produto4 = Mockito.mock(Product.class);
        Mockito.when(produto4.getValue()).thenReturn(100.0f);
        Mockito.when(produto4.getWeight()).thenReturn(0.25f);
        Mockito.when(produto4.getName()).thenReturn("Produto4");

        Product produto5 = Mockito.mock(Product.class);
        Mockito.when(produto5.getValue()).thenReturn(100.0f);
        Mockito.when(produto5.getWeight()).thenReturn(1.0f);
        Mockito.when(produto5.getName()).thenReturn("Produto5");

        ShoppingCart cart = new ShoppingCart();
        cart.setProducts(Arrays.asList(produto1, produto1, produto3, produto4, produto5));
        carrinho5itenspeso2valor500(id, cart);
        // ----------------------------

        Mockito.when(produto5.getValue()).thenReturn(101.0f);
        Mockito.when(produto5.getWeight()).thenReturn(1.0f);
        Mockito.when(produto5.getName()).thenReturn("produto5");
        carrinho5itenspeso2valor501(id, cart);
        // ----------------------------

        Mockito.when(produto5.getValue()).thenReturn(600.0f);
        Mockito.when(produto5.getWeight()).thenReturn(1.0f);
        Mockito.when(produto5.getName()).thenReturn("produto5");
        carrinho5itenspeso2valor1000(id, cart);
        // ----------------------------

        Mockito.when(produto5.getValue()).thenReturn(601.0f);
        Mockito.when(produto5.getWeight()).thenReturn(1.0f);
        Mockito.when(produto5.getName()).thenReturn("produto5");
        carrinho5itenspeso2valor1001(id, cart);
        // ----------------------------

        Mockito.when(produto5.getValue()).thenReturn(100.0f);
        Mockito.when(produto5.getWeight()).thenReturn(2.0f);
        Mockito.when(produto5.getName()).thenReturn("produto5");
        carrinho5itenspeso3valor500(id, cart);
        // ----------------------------

        Mockito.when(produto5.getValue()).thenReturn(101.0f);
        Mockito.when(produto5.getWeight()).thenReturn(2.0f);
        Mockito.when(produto5.getName()).thenReturn("produto5");
        carrinho5itenspeso3valor501(id, cart);
        // ----------------------------

        Mockito.when(produto5.getValue()).thenReturn(600.0f);
        Mockito.when(produto5.getWeight()).thenReturn(2.0f);
        Mockito.when(produto5.getName()).thenReturn("produto5");
        carrinho5itenspeso3valor1000(id, cart);
        // ----------------------------

        Mockito.when(produto5.getValue()).thenReturn(601.0f);
        Mockito.when(produto5.getWeight()).thenReturn(2.0f);
        Mockito.when(produto5.getName()).thenReturn("produto5");
        carrinho5itenspeso3valor1001(id, cart);
        // ----------------------------

        Mockito.when(produto5.getValue()).thenReturn(100.0f);
        Mockito.when(produto5.getWeight()).thenReturn(10.0f);
        Mockito.when(produto5.getName()).thenReturn("produto5");
        carrinho5itenspes11valor500(id, cart);
        // ----------------------------

        Mockito.when(produto5.getValue()).thenReturn(101.0f);
        Mockito.when(produto5.getWeight()).thenReturn(10.0f);
        Mockito.when(produto5.getName()).thenReturn("produto5");
        carrinho5itenspeso11valor501(id, cart);
        // ----------------------------

        Mockito.when(produto5.getValue()).thenReturn(600.0f);
        Mockito.when(produto5.getWeight()).thenReturn(10.0f);
        Mockito.when(produto5.getName()).thenReturn("produto5");
        carrinho5itenspeso11valor1000(id, cart);
        // ----------------------------

        Mockito.when(produto5.getValue()).thenReturn(601.0f);
        Mockito.when(produto5.getWeight()).thenReturn(10.0f);
        Mockito.when(produto5.getName()).thenReturn("produto5");
        carrinho5itenspeso11valor1001(id, cart);
        // ----------------------------

        Mockito.when(produto5.getValue()).thenReturn(100.0f);
        Mockito.when(produto5.getWeight()).thenReturn(50.0f);
        Mockito.when(produto5.getName()).thenReturn("produto5");
        carrinho5itenspeso51valor500(id, cart);
        // ----------------------------

        Mockito.when(produto5.getValue()).thenReturn(101.0f);
        Mockito.when(produto5.getWeight()).thenReturn(50.0f);
        Mockito.when(produto5.getName()).thenReturn("produto5");
        carrinho5itenspeso51valor501(id, cart);
        // ----------------------------

        Mockito.when(produto5.getValue()).thenReturn(600.0f);
        Mockito.when(produto5.getWeight()).thenReturn(50.0f);
        Mockito.when(produto5.getName()).thenReturn("produto5");
        carrinho5itenspeso51valor1000(id, cart);
        // ----------------------------

        Mockito.when(produto5.getValue()).thenReturn(601.0f);
        Mockito.when(produto5.getWeight()).thenReturn(50.0f);
        Mockito.when(produto5.getName()).thenReturn("produto5");
        carrinho5itenspeso51valor1001(id, cart);
    }
    // ===================================================================================

    public void carrinho5itenspeso2valor500(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 500.0f;
        Float actual = service.checkout(id);
        assertEquals(expected, actual);
    }

    public void carrinho5itenspeso2valor501(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 450.90f;
        Float actual = service.checkout(id);
        assertEquals(expected, actual);
    }

    public void carrinho5itenspeso2valor1000(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 900.0f;
        Float actual = service.checkout(id);
        assertEquals(expected, actual);
    }

    public void carrinho5itenspeso2valor1001(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 800.8f;
        Float actual = service.checkout(id);
        assertEquals(expected, actual);
    }

    public void carrinho5itenspeso3valor500(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 506.0f;
        Float actual = service.checkout(id);
        assertEquals(expected, actual);
    }

    public void carrinho5itenspeso3valor501(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 456.9f;
        Float actual = service.checkout(id);
        assertEquals(expected, actual);
    }

    public void carrinho5itenspeso3valor1000(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 906.0f;
        Float actual = service.checkout(id);
        assertEquals(expected, actual);
    }

    public void carrinho5itenspeso3valor1001(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 806.8f;
        Float actual = service.checkout(id);
        assertEquals(expected, actual);
    }

    public void carrinho5itenspes11valor500(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 544.0f;
        Float actual = service.checkout(id);
        assertEquals(expected, actual);
    }

    public void carrinho5itenspeso11valor501(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 494.9f;
        Float actual = service.checkout(id);
        assertEquals(expected, actual);
    }

    public void carrinho5itenspeso11valor1000(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 944.0f;
        Float actual = service.checkout(id);
        assertEquals(expected, actual);
    }

    public void carrinho5itenspeso11valor1001(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 844.8f;
        Float actual = service.checkout(id);
        assertEquals(expected, actual);
    }

    public void carrinho5itenspeso51valor500(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 857.0f;
        Float actual = service.checkout(id);
        assertEquals(expected, actual);
    }

    public void carrinho5itenspeso51valor501(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 807.9f;
        Float actual = service.checkout(id);
        assertEquals(expected, actual);
    }

    public void carrinho5itenspeso51valor1000(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 1257.0f;
        Float actual = service.checkout(id);
        System.out.println(carrinho.getFinalValue());
        System.out.println(carrinho.getTotalWeight());
        assertEquals(expected, actual);
    }

    public void carrinho5itenspeso51valor1001(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 1157.8f;
        Float actual = service.checkout(id);
        System.out.println(carrinho.getFinalValue());
        System.out.println(carrinho.getTotalWeight());
        assertEquals(expected, actual);
    }
}
