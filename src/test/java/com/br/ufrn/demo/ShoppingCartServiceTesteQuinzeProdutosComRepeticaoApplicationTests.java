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

public class ShoppingCartServiceTesteQuinzeProdutosComRepeticaoApplicationTests {
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

        Product produto4 = Mockito.mock(Product.class);
        Mockito.when(produto4.getValue()).thenReturn(5.0f);
        Mockito.when(produto4.getWeight()).thenReturn(0.10f);
        Mockito.when(produto4.getName()).thenReturn("Produto4");

        Product produto5 = Mockito.mock(Product.class);
        Mockito.when(produto5.getValue()).thenReturn(5.0f);
        Mockito.when(produto5.getWeight()).thenReturn(0.10f);
        Mockito.when(produto5.getName()).thenReturn("Produto5");

        Product produto6 = Mockito.mock(Product.class);
        Mockito.when(produto6.getValue()).thenReturn(5.0f);
        Mockito.when(produto6.getWeight()).thenReturn(0.10f);
        Mockito.when(produto6.getName()).thenReturn("Produto6");

        Product produto7 = Mockito.mock(Product.class);
        Mockito.when(produto7.getValue()).thenReturn(5.0f);
        Mockito.when(produto7.getWeight()).thenReturn(0.10f);
        Mockito.when(produto7.getName()).thenReturn("Produto7");

        Product produto8 = Mockito.mock(Product.class);
        Mockito.when(produto8.getValue()).thenReturn(5.0f);
        Mockito.when(produto8.getWeight()).thenReturn(0.10f);
        Mockito.when(produto8.getName()).thenReturn("Produto8");

        Product produto9 = Mockito.mock(Product.class);
        Mockito.when(produto9.getValue()).thenReturn(5.0f);
        Mockito.when(produto9.getWeight()).thenReturn(0.10f);
        Mockito.when(produto9.getName()).thenReturn("Produto9");

        Product produto10 = Mockito.mock(Product.class);
        Mockito.when(produto10.getValue()).thenReturn(5.0f);
        Mockito.when(produto10.getWeight()).thenReturn(0.10f);
        Mockito.when(produto10.getName()).thenReturn("Produto10");

        Product produto11 = Mockito.mock(Product.class);
        Mockito.when(produto11.getValue()).thenReturn(5.0f);
        Mockito.when(produto11.getWeight()).thenReturn(0.10f);
        Mockito.when(produto11.getName()).thenReturn("Produto11");

        Product produto12 = Mockito.mock(Product.class);
        Mockito.when(produto12.getValue()).thenReturn(5.0f);
        Mockito.when(produto12.getWeight()).thenReturn(0.10f);
        Mockito.when(produto12.getName()).thenReturn("Produto12");

        Product produto13 = Mockito.mock(Product.class);
        Mockito.when(produto13.getValue()).thenReturn(5.0f);
        Mockito.when(produto13.getWeight()).thenReturn(0.10f);
        Mockito.when(produto13.getName()).thenReturn("Produto13");

        Product produto14 = Mockito.mock(Product.class);
        Mockito.when(produto14.getValue()).thenReturn(5.0f);
        Mockito.when(produto14.getWeight()).thenReturn(0.10f);
        Mockito.when(produto14.getName()).thenReturn("Produto14");

        Product produto15 = Mockito.mock(Product.class);
        Mockito.when(produto15.getValue()).thenReturn(430.0f);
        Mockito.when(produto15.getWeight()).thenReturn(0.5f);
        Mockito.when(produto15.getName()).thenReturn("Produto15");

        ShoppingCart cart = new ShoppingCart();
        cart.setProducts(Arrays.asList(produto1, produto1, produto1, produto4, produto5, produto6, produto7, produto8,
                produto9, produto10, produto11, produto12, produto13, produto14, produto15));

        carrinho15itenspeso2valor500(id, cart);

        // altera valores produto 15
        Mockito.when(produto15.getValue()).thenReturn(431.0f);
        Mockito.when(produto15.getWeight()).thenReturn(0.5f);
        Mockito.when(produto15.getName()).thenReturn("Produto15");

        carrinho15itenspeso2valor501(id, cart);

        // altera valores produto 15
        Mockito.when(produto15.getValue()).thenReturn(930.0f);
        Mockito.when(produto15.getWeight()).thenReturn(0.5f);
        Mockito.when(produto15.getName()).thenReturn("Produto15");
        carrinho15itenspeso2valor1000(id, cart);

        // altera valores produto 15
        Mockito.when(produto15.getValue()).thenReturn(931.0f);
        Mockito.when(produto15.getWeight()).thenReturn(0.5f);
        Mockito.when(produto15.getName()).thenReturn("Produto15");
        carrinho15itenspeso2valor1001(id, cart);

        // altera valores produto 15
        Mockito.when(produto15.getValue()).thenReturn(430.0f);
        Mockito.when(produto15.getWeight()).thenReturn(1.6f);
        Mockito.when(produto15.getName()).thenReturn("Produto15");
        carrinho15itenspeso3valor500(id, cart);

        // altera valores produto 15
        Mockito.when(produto15.getValue()).thenReturn(431.0f);
        Mockito.when(produto15.getWeight()).thenReturn(1.6f);
        Mockito.when(produto15.getName()).thenReturn("Produto15");
        carrinho15itenspeso3valor501(id, cart);

        // altera valores produto 15
        Mockito.when(produto15.getValue()).thenReturn(930.0f);
        Mockito.when(produto15.getWeight()).thenReturn(1.6f);
        Mockito.when(produto15.getName()).thenReturn("Produto15");
        carrinho15itenspeso3valor1000(id, cart);

        // altera valores produto 15
        Mockito.when(produto15.getValue()).thenReturn(931.0f);
        Mockito.when(produto15.getWeight()).thenReturn(1.6f);
        Mockito.when(produto15.getName()).thenReturn("Produto15");
        carrinho15itenspeso3valor1001(id, cart);

        // altera valores produto 15
        Mockito.when(produto15.getValue()).thenReturn(430.0f);
        Mockito.when(produto15.getWeight()).thenReturn(9.6f);
        Mockito.when(produto15.getName()).thenReturn("Produto15");
        carrinho15itenspes11valor500(id, cart);

        // altera valores produto 15
        Mockito.when(produto15.getValue()).thenReturn(431.0f);
        Mockito.when(produto15.getWeight()).thenReturn(9.6f);
        Mockito.when(produto15.getName()).thenReturn("Produto15");
        carrinho15itenspeso11valor501(id, cart);

        // altera valores produto 15
        Mockito.when(produto15.getValue()).thenReturn(930.0f);
        Mockito.when(produto15.getWeight()).thenReturn(9.6f);
        Mockito.when(produto15.getName()).thenReturn("Produto15");
        carrinho15itenspeso11valor1000(id, cart);

        // altera valores produto 15
        Mockito.when(produto15.getValue()).thenReturn(931.0f);
        Mockito.when(produto15.getWeight()).thenReturn(9.6f);
        Mockito.when(produto15.getName()).thenReturn("Produto15");
        carrinho15itenspeso11valor1001(id, cart);

        // altera valores produto 15
        Mockito.when(produto15.getValue()).thenReturn(430.0f);
        Mockito.when(produto15.getWeight()).thenReturn(49.6f);
        Mockito.when(produto15.getName()).thenReturn("Produto15");
        carrinho15itenspes51valor500(id, cart);

        // altera valores produto 15
        Mockito.when(produto15.getValue()).thenReturn(431.0f);
        Mockito.when(produto15.getWeight()).thenReturn(49.6f);
        Mockito.when(produto15.getName()).thenReturn("Produto15");
        carrinho15itenspeso51valor501(id, cart);

        // altera valores produto 15
        Mockito.when(produto15.getValue()).thenReturn(930.0f);
        Mockito.when(produto15.getWeight()).thenReturn(49.6f);
        Mockito.when(produto15.getName()).thenReturn("Produto15");
        carrinho15itenspeso51valor1000(id, cart);

        // altera valores produto 15
        Mockito.when(produto15.getValue()).thenReturn(931.0f);
        Mockito.when(produto15.getWeight()).thenReturn(49.6f);
        Mockito.when(produto15.getName()).thenReturn("Produto15");
        carrinho15itenspeso51valor1001(id, cart);

    }

    // ===================================================================================

    public void carrinho15itenspeso2valor500(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 509.5f;
        Float actual = service.checkout(id);
        System.out.println(carrinho.getFinalValue());
        assertEquals(expected, actual);
    }

    public void carrinho15itenspeso2valor501(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 460.40f;
        Float actual = service.checkout(id);
        // System.out.println(carrinho.getCartDiscount());
        // System.out.println(carrinho.getShippingDiscount());
        System.out.println(carrinho.getFinalValue());
        // System.out.println(carrinho.getTotalWeight());
        assertEquals(expected, actual);
    }

    public void carrinho15itenspeso2valor1000(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 909.5f;
        Float actual = service.checkout(id);
        // System.out.println(carrinho.getCartDiscount());
        // System.out.println(carrinho.getShippingDiscount());
        System.out.println(carrinho.getFinalValue());
        // System.out.println(carrinho.getTotalWeight());
        assertEquals(expected, actual);
    }

    public void carrinho15itenspeso2valor1001(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 810.3f;
        Float actual = service.checkout(id);
        // System.out.println(carrinho.getCartDiscount());
        // System.out.println(carrinho.getShippingDiscount());
        System.out.println(carrinho.getFinalValue());
        // System.out.println(carrinho.getTotalWeight());
        assertEquals(expected, actual);
    }

    public void carrinho15itenspeso3valor500(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 515.2f;
        Float actual = service.checkout(id);
        System.out.println(carrinho.getFinalValue());
        System.out.println(carrinho.getTotalWeight());
        assertEquals(expected, actual);
    }

    public void carrinho15itenspeso3valor501(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 466.1f;
        Float actual = service.checkout(id);
        System.out.println(carrinho.getFinalValue());
        System.out.println(carrinho.getTotalWeight());
        assertEquals(expected, actual);
    }

    public void carrinho15itenspeso3valor1000(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 915.2f;
        Float actual = service.checkout(id);
        System.out.println(carrinho.getFinalValue());
        System.out.println(carrinho.getTotalWeight());
        assertEquals(expected, actual);
    }

    public void carrinho15itenspeso3valor1001(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 816.0f;
        Float actual = service.checkout(id);
        System.out.println(carrinho.getFinalValue());
        System.out.println(carrinho.getTotalWeight());
        assertEquals(expected, actual);
    }

    public void carrinho15itenspes11valor500(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 551.3f;
        Float actual = service.checkout(id);
        System.out.println(carrinho.getFinalValue());
        System.out.println(carrinho.getTotalWeight());
        assertEquals(expected, actual);
    }

    public void carrinho15itenspeso11valor501(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 502.2f;
        Float actual = service.checkout(id);
        System.out.println(carrinho.getFinalValue());
        System.out.println(carrinho.getTotalWeight());
        assertEquals(expected, actual);
    }

    public void carrinho15itenspeso11valor1000(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 951.3f;
        Float actual = service.checkout(id);
        System.out.println(carrinho.getFinalValue());
        System.out.println(carrinho.getTotalWeight());
        assertEquals(expected, actual);
    }

    public void carrinho15itenspeso11valor1001(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 852.1f;
        Float actual = service.checkout(id);
        System.out.println(carrinho.getFinalValue());
        System.out.println(carrinho.getTotalWeight());
        assertEquals(expected, actual);
    }

    public void carrinho15itenspes51valor500(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 848.65f;
        Float actual = service.checkout(id);
        System.out.println(carrinho.getFinalValue());
        System.out.println(carrinho.getTotalWeight());
        assertEquals(expected, actual);
    }

    public void carrinho15itenspeso51valor501(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 799.55f;
        Float actual = service.checkout(id);
        System.out.println(carrinho.getFinalValue());
        System.out.println(carrinho.getTotalWeight());
        assertEquals(expected, actual);
    }

    public void carrinho15itenspeso51valor1000(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 1248.65f;
        Float actual = service.checkout(id);
        System.out.println(carrinho.getFinalValue());
        System.out.println(carrinho.getTotalWeight());
        assertEquals(expected, actual);
    }

    public void carrinho15itenspeso51valor1001(UUID id, ShoppingCart carrinho) {
        when(repository.findById(id)).thenReturn(Optional.of(carrinho));
        Float expected = 1149.45f;
        Float actual = service.checkout(id);
        System.out.println(carrinho.getFinalValue());
        System.out.println(carrinho.getTotalWeight());
        assertEquals(expected, actual);
    }

}
