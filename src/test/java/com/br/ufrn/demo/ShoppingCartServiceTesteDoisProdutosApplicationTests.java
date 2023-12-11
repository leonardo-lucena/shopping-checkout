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

public class ShoppingCartServiceTesteDoisProdutosApplicationTests {
    ShoppingCartRepository repository = Mockito.mock(ShoppingCartRepository.class);
    ShoppingCartService service = new ShoppingCartService(repository);

    @Test
    public void testCheckout() {
        UUID id = UUID.randomUUID();
        Product product1 = Mockito.mock(Product.class);
        Product product2 = Mockito.mock(Product.class);
        when(product1.getValue()).thenReturn(600.0f);
        when(product2.getValue()).thenReturn(600.0f);
        when(product1.getWeight()).thenReturn(60.0f);
        when(product2.getWeight()).thenReturn(60.0f);
        when(product1.getName()).thenReturn("Produto1");
        when(product2.getName()).thenReturn("Produto2");

        ShoppingCart cart = new ShoppingCart();
        cart.setProducts(Arrays.asList(product1, product2));
        when(repository.findById(id)).thenReturn(Optional.of(cart));

        Float expected = 1800.0f;
        Float actual = service.checkout(id);

        assertEquals(expected, actual);
    }

}
