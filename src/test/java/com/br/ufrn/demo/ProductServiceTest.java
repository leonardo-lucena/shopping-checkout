
package com.br.ufrn.demo;

import com.br.ufrn.demo.service.ProductService;
import com.br.ufrn.demo.model.Product;
import com.br.ufrn.demo.repository.ProductRepository;
import org.hibernate.Filter;
import org.hibernate.Session;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import jakarta.persistence.EntityManager;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class ProductServiceTest {

    @InjectMocks
    ProductService productService;

    @Mock
    EntityManager entityManager;

    @Mock
    Session session;

    @Mock
    Filter filter;

    @Mock
    ProductRepository productRepository;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        when(entityManager.unwrap(Session.class)).thenReturn(session);
        productService = new ProductService(productRepository, entityManager);
    }

    @Test
    public void testInsert() {
        Product product = new Product();
        when(productRepository.save(any(Product.class))).thenReturn(product);

        Product result = productService.insert(product);

        assertNotNull(result);
        assertEquals(product, result);
    }

    @Test
    public void testFindById() {
        UUID id = UUID.randomUUID();
        Product product = new Product();
        when(productRepository.findById(id)).thenReturn(Optional.of(product));

        Product result = productService.findById(id);

        assertNotNull(result);
        assertEquals(product, result);
    }

    @Test
    public void testFindAll() {
        when(session.enableFilter("deletedProductFilter")).thenReturn(filter);
        when(productRepository.findAll()).thenReturn(Arrays.asList(new Product(), new Product()));

        List<Product> result = productService.findAll(false);

        assertNotNull(result);
        assertEquals(2, result.size());
    }
}