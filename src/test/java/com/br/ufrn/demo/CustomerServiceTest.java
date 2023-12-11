package com.br.ufrn.demo;

import com.br.ufrn.demo.model.Customer;
import com.br.ufrn.demo.repository.CustomerRepository;
import com.br.ufrn.demo.service.CustomerService;
import org.hibernate.Session;
import org.hibernate.Filter;
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

public class CustomerServiceTest {

    @InjectMocks
    CustomerService customerService;

    @Mock
    EntityManager entityManager;

    @Mock
    Session session;

    @Mock
    Filter filter;

    @Mock
    CustomerRepository customerRepository;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        when(entityManager.unwrap(Session.class)).thenReturn(session);
        customerService = new CustomerService(entityManager, customerRepository);
    }

    @Test
    public void testInsert() {
        Customer customer = new Customer();
        when(customerRepository.save(any(Customer.class))).thenReturn(customer);

        Customer result = customerService.insert(customer);

        assertNotNull(result);
        assertEquals(customer, result);
    }

    @Test
    public void testFindById() {
        UUID id = UUID.randomUUID();
        Customer customer = new Customer();
        when(customerRepository.findById(id)).thenReturn(Optional.of(customer));

        Customer result = customerService.findById(id);

        assertNotNull(result);
        assertEquals(customer, result);
    }

    @Test
    public void testFindAll() {
        when(session.enableFilter("deletedCustomerFilter")).thenReturn(filter);
        when(customerRepository.findAll()).thenReturn(Arrays.asList(new Customer(), new Customer()));

        List<Customer> result = customerService.findAll(false);

        assertNotNull(result);
        assertEquals(2, result.size());
    }
}