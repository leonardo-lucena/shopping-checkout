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

public class ShoppingCartServiceTesteSeisProdutosComRepeticaoApplicationTests {
    ShoppingCartRepository repository = Mockito.mock(ShoppingCartRepository.class);
    ShoppingCartService service = new ShoppingCartService(repository);

    @Test
    public void testCheckout() {
        UUID id = UUID.randomUUID();

        // Criar objetos mockados usando o Mockito
        Product produto1 = Mockito.mock(Product.class);
        Mockito.when(produto1.getValue()).thenReturn(5.0f);
        Mockito.when(produto1.getWeight()).thenReturn(0.10f);
        Mockito.when(produto1.getName()).thenReturn("Produto1");

        Product produto2 = Mockito.mock(Product.class);
        Mockito.when(produto2.getValue()).thenReturn(5.0f);
        Mockito.when(produto2.getWeight()).thenReturn(0.10f);
        Mockito.when(produto2.getName()).thenReturn("Produto2");

        Product produto3 = Mockito.mock(Product.class);
        Mockito.when(produto3.getValue()).thenReturn(5.0f);
        Mockito.when(produto3.getWeight()).thenReturn(0.10f);
        Mockito.when(produto3.getName()).thenReturn("Produto3");

        Product produto4 = Mockito.mock(Product.class);
        Mockito.when(produto4.getValue()).thenReturn(5.0f);
        Mockito.when(produto4.getWeight()).thenReturn(0.10f);
        Mockito.when(produto4.getName()).thenReturn("Produto4");

        Product produto5 = Mockito.mock(Product.class);
        Mockito.when(produto5.getValue()).thenReturn(5.0f);
        Mockito.when(produto5.getWeight()).thenReturn(0.10f);
        Mockito.when(produto5.getName()).thenReturn("Produto5");

        Product produto6 = Mockito.mock(Product.class);
        Mockito.when(produto6.getValue()).thenReturn(475.0f);
        Mockito.when(produto6.getWeight()).thenReturn(1.50f);
        Mockito.when(produto6.getName()).thenReturn("Produto6");


        ShoppingCart cart = new ShoppingCart();
        cart.setProducts(Arrays.asList(produto1, produto1, produto1, produto4, produto5, produto6));
        carrinho6itenspeso2valor500(id, cart);

        // altera valores produto 15
        Mockito.when(produto6.getValue()).thenReturn(476.0f);
        Mockito.when(produto6.getWeight()).thenReturn(0.5f);
        Mockito.when(produto6.getName()).thenReturn("Produto6");
        carrinho6itenspeso2valor501(id, cart);

        // altera valores produto 15
        Mockito.when(produto6.getValue()).thenReturn(975.0f);
        Mockito.when(produto6.getWeight()).thenReturn(0.5f);
        Mockito.when(produto6.getName()).thenReturn("Produto6");
        carrinho6itenspeso2valor1000(id, cart);

        // altera valores produto 15
        Mockito.when(produto6.getValue()).thenReturn(976.0f);
        Mockito.when(produto6.getWeight()).thenReturn(0.5f);
        Mockito.when(produto6.getName()).thenReturn("Produto6");
        carrinho6itenspeso2valor1001(id, cart);

        // altera valores produto 15
        Mockito.when(produto6.getValue()).thenReturn(475.0f);
        Mockito.when(produto6.getWeight()).thenReturn(2.5f);
        Mockito.when(produto6.getName()).thenReturn("Produto6");
        carrinho6itenspeso3valor500(id, cart);

        // altera valores produto 15
        Mockito.when(produto6.getValue()).thenReturn(476.0f);
        Mockito.when(produto6.getWeight()).thenReturn(2.5f);
        Mockito.when(produto6.getName()).thenReturn("Produto6");
        carrinho6itenspeso3valor501(id, cart);

        // altera valores produto 15
        Mockito.when(produto6.getValue()).thenReturn(975.0f);
        Mockito.when(produto6.getWeight()).thenReturn(2.5f);
        Mockito.when(produto6.getName()).thenReturn("Produto6");
        carrinho6itenspeso3valor1000(id, cart);

        // altera valores produto 15
        Mockito.when(produto6.getValue()).thenReturn(976.0f);
        Mockito.when(produto6.getWeight()).thenReturn(2.5f);
        Mockito.when(produto6.getName()).thenReturn("Produto6");
        carrinho6itenspeso3valor1001(id, cart);

        // altera valores produto 15
        Mockito.when(produto6.getValue()).thenReturn(475.0f);
        Mockito.when(produto6.getWeight()).thenReturn(10.5f);
        Mockito.when(produto6.getName()).thenReturn("Produto6");
        carrinho6itenspes11valor500(id, cart);

        // altera valores produto 15
        Mockito.when(produto6.getValue()).thenReturn(476.0f);
        Mockito.when(produto6.getWeight()).thenReturn(10.5f);
        Mockito.when(produto6.getName()).thenReturn("Produto6");
        carrinho6itenspeso11valor501(id, cart);

        // altera valores produto 15
        Mockito.when(produto6.getValue()).thenReturn(975.0f);
        Mockito.when(produto6.getWeight()).thenReturn(10.5f);
        Mockito.when(produto6.getName()).thenReturn("Produto6");
        carrinho6itenspeso11valor1000(id, cart);

        // altera valores produto 15
        Mockito.when(produto6.getValue()).thenReturn(976.0f);
        Mockito.when(produto6.getWeight()).thenReturn(10.5f);
        Mockito.when(produto6.getName()).thenReturn("Produto6");
        carrinho6itenspeso11valor1001(id, cart);

        // altera valores produto 15
        Mockito.when(produto6.getValue()).thenReturn(475.0f);
        Mockito.when(produto6.getWeight()).thenReturn(50.5f);
        Mockito.when(produto6.getName()).thenReturn("Produto6");
        carrinho6itenspes51valor500(id, cart);

        // altera valores produto 15
        Mockito.when(produto6.getValue()).thenReturn(476.0f);
        Mockito.when(produto6.getWeight()).thenReturn(50.5f);
        Mockito.when(produto6.getName()).thenReturn("Produto6");
        carrinho6itenspeso51valor501(id, cart);

        // altera valores produto 15
        Mockito.when(produto6.getValue()).thenReturn(975.0f);
        Mockito.when(produto6.getWeight()).thenReturn(50.5f);
        Mockito.when(produto6.getName()).thenReturn("Produto6");
        carrinho6itenspeso51valor1000(id, cart);

        // altera valores produto 15
        Mockito.when(produto6.getValue()).thenReturn(976.0f);
        Mockito.when(produto6.getWeight()).thenReturn(50.5f);
        Mockito.when(produto6.getName()).thenReturn("Produto6");
        carrinho6itenspeso51valor1001(id, cart);

    }

    // ===================================================================================

    public void carrinho6itenspeso2valor500(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 509.5f;
        Float actual = service.checkout(id);
        System.out.println(carrinho.getFinalValue());
        assertEquals(expected, actual);
    }

    public void carrinho6itenspeso2valor501(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 460.4f;
        Float actual = service.checkout(id);
        // System.out.println(carrinho.getCartDiscount());
        // System.out.println(carrinho.getShippingDiscount());
        System.out.println(carrinho.getFinalValue());
        // System.out.println(carrinho.getTotalWeight());
        assertEquals(expected, actual);
    }

    public void carrinho6itenspeso2valor1000(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 909.5f;
        Float actual = service.checkout(id);
        // System.out.println(carrinho.getCartDiscount());
        // System.out.println(carrinho.getShippingDiscount());
        System.out.println(carrinho.getFinalValue());
        // System.out.println(carrinho.getTotalWeight());
        assertEquals(expected, actual);
    }

    public void carrinho6itenspeso2valor1001(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 810.3f;
        Float actual = service.checkout(id);
        // System.out.println(carrinho.getCartDiscount());
        // System.out.println(carrinho.getShippingDiscount());
        System.out.println(carrinho.getFinalValue());
        // System.out.println(carrinho.getTotalWeight());
        assertEquals(expected, actual);
    }

    public void carrinho6itenspeso3valor500(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 515.2f;
        Float actual = service.checkout(id);
        System.out.println(carrinho.getFinalValue());
        System.out.println(carrinho.getTotalWeight());
        assertEquals(expected, actual);
    }

    public void carrinho6itenspeso3valor501(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 466.1f;
        Float actual = service.checkout(id);
        System.out.println(carrinho.getFinalValue());
        System.out.println(carrinho.getTotalWeight());
        assertEquals(expected, actual);
    }

    public void carrinho6itenspeso3valor1000(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 915.2f;
        Float actual = service.checkout(id);
        System.out.println(carrinho.getFinalValue());
        System.out.println(carrinho.getTotalWeight());
        assertEquals(expected, actual);
    }

    public void carrinho6itenspeso3valor1001(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 816.0f;
        Float actual = service.checkout(id);
        System.out.println(carrinho.getFinalValue());
        System.out.println(carrinho.getTotalWeight());
        assertEquals(expected, actual);
    }

    public void carrinho6itenspes11valor500(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 551.3f;
        Float actual = service.checkout(id);
        System.out.println(carrinho.getFinalValue());
        System.out.println(carrinho.getTotalWeight());
        assertEquals(expected, actual);
    }

    public void carrinho6itenspeso11valor501(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 502.19998f;
        Float actual = service.checkout(id);
        System.out.println(carrinho.getFinalValue());
        System.out.println(carrinho.getTotalWeight());
        assertEquals(expected, actual);
    }

    public void carrinho6itenspeso11valor1000(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 951.3f;
        Float actual = service.checkout(id);
        System.out.println(carrinho.getFinalValue());
        System.out.println(carrinho.getTotalWeight());
        assertEquals(expected, actual);
    }

    public void carrinho6itenspeso11valor1001(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 852.1f;
        Float actual = service.checkout(id);
        System.out.println(carrinho.getFinalValue());
        System.out.println(carrinho.getTotalWeight());
        assertEquals(expected, actual);
    }

    public void carrinho6itenspes51valor500(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 848.65f;
        Float actual = service.checkout(id);
        System.out.println(carrinho.getFinalValue());
        System.out.println(carrinho.getTotalWeight());
        assertEquals(expected, actual);
    }

    public void carrinho6itenspeso51valor501(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 799.55f;
        Float actual = service.checkout(id);
        System.out.println(carrinho.getFinalValue());
        System.out.println(carrinho.getTotalWeight());
        assertEquals(expected, actual);
    }

    public void carrinho6itenspeso51valor1000(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 1248.65f;
        Float actual = service.checkout(id);
        System.out.println(carrinho.getFinalValue());
        System.out.println(carrinho.getTotalWeight());
        assertEquals(expected, actual);
    }

    public void carrinho6itenspeso51valor1001(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 1149.45f;
        Float actual = service.checkout(id);
        System.out.println(carrinho.getFinalValue());
        System.out.println(carrinho.getTotalWeight());
        assertEquals(expected, actual);
    }

}
