package com.br.ufrn.demo;

import com.br.ufrn.demo.model.ShoppingCart;
import com.br.ufrn.demo.service.ShoppingCartService;
import com.br.ufrn.demo.repository.ShoppingCartRepository;
import org.hibernate.Filter;
import org.hibernate.Session;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.times;

import jakarta.persistence.EntityManager;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class ShoppingCartServiceOutrosTestes {
    @InjectMocks
    ShoppingCartService shoppingCartService;

    @Mock
    EntityManager entityManager;

    @Mock
    Session session;

    @Mock
    Filter filter;

    @Mock
    ShoppingCartRepository shoppingCartRepository;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        when(entityManager.unwrap(Session.class)).thenReturn(session);
        shoppingCartService = new ShoppingCartService(shoppingCartRepository);
    }

    @Test
    public void testInsert() {
        ShoppingCart shoppingCart = new ShoppingCart();
        when(shoppingCartRepository.save(any(ShoppingCart.class))).thenReturn(shoppingCart);

        ShoppingCart result = shoppingCartService.insert(shoppingCart);

        assertNotNull(result);
        assertEquals(shoppingCart, result);
    }

    @Test
    public void testFindById() {
        UUID id = UUID.randomUUID();
        ShoppingCart shoppingCart = new ShoppingCart();
        when(shoppingCartRepository.findById(id)).thenReturn(Optional.of(shoppingCart));

        ShoppingCart result = shoppingCartService.findById(id);

        assertNotNull(result);
        assertEquals(shoppingCart, result);
    }

    @Test
    public void testFindAll() {
        when(session.enableFilter("deletedShoppingCartFilter")).thenReturn(filter);
        when(shoppingCartRepository.findAll()).thenReturn(Arrays.asList(new ShoppingCart(), new ShoppingCart()));

        List<ShoppingCart> result = shoppingCartService.findAll(false);

        assertNotNull(result);
        assertEquals(2, result.size());
    }

    @Test
    public void testUpdate() {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setId(UUID.randomUUID());
        when(shoppingCartRepository.findById(shoppingCart.getId())).thenReturn(Optional.of(shoppingCart));
        when(shoppingCartRepository.save(any(ShoppingCart.class))).thenReturn(shoppingCart);

        ShoppingCart result = shoppingCartService.update(shoppingCart.getId(), shoppingCart);

        assertNotNull(result);
        assertEquals(shoppingCart, result);
    }

    @Test
    public void testDelete() {
        UUID id = UUID.randomUUID();
        shoppingCartService.delete(id);
        Mockito.verify(shoppingCartRepository, times(1)).deleteById(id);
    }

}
