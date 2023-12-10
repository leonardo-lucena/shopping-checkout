package com.br.ufrn.demo.service;

import com.br.ufrn.demo.model.Customer;
import com.br.ufrn.demo.model.Product;
import com.br.ufrn.demo.repository.CustomerRepository;
import jakarta.persistence.EntityManager;
import org.hibernate.Filter;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import java.util.Optional;
import java.util.UUID;

@Service
public class CustomerService {
    CustomerRepository repository;

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private ProductService productService;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    // Adicionar
    public Customer insert(Customer customer) {
        Customer save = repository.save(customer);
        return save;
    }

    // Consultar
    public Customer findById(UUID id) {
        Optional<Customer> customer = repository.findById(id);
        return customer.orElse(null);
    }

    public List<Customer> findAll(boolean isDeleted) {
        Session session = entityManager.unwrap(Session.class);
        Filter filter = session.enableFilter("deletedCustomerFilter");
        filter.setParameter("isDeleted", isDeleted);
        List<Customer> customer = repository.findAll();
        session.disableFilter("deletedCustomerFilter");
        return customer;
    }

    public Customer update(UUID id, Customer customer) {
        Optional<Customer> optional = repository.findById(id);
        if (optional.isPresent()) {
            Customer customerUpdated = optional.get();
            customerUpdated.setName(customer.getName());
            customerUpdated.setUser_shopping_cart(customer.getUser_shopping_cart());
            repository.save(customerUpdated);
            return customerUpdated;
        } else {
            throw new RuntimeException("Não foi possível atualizar o registro");
        }
    }

    // Remover
    public void delete(UUID id) {
        repository.deleteById(id);
    }

    public void addProduct(UUID idCustomer, UUID idProduct) {
        Optional<Customer> optional = repository.findById(idCustomer);
        if (optional.isPresent()) {
            Customer customerUpdated = optional.get();
            Optional<Product> product = Optional.ofNullable(productService.findById(idProduct));
            product.ifPresent(value -> customerUpdated.getUser_shopping_cart().getProducts().add(value));
            update(idCustomer, customerUpdated);
        } else {
            throw new RuntimeException("Não foi possível atualizar o registro");
        }
    }
}
