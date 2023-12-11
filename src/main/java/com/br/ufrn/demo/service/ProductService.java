package com.br.ufrn.demo.service;

import com.br.ufrn.demo.model.Product;
import com.br.ufrn.demo.repository.ProductRepository;
import jakarta.persistence.EntityManager;
import org.hibernate.Filter;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {
    @Autowired
    ProductRepository repository;

    @Autowired
    EntityManager entityManager;

    public ProductService(ProductRepository productRepository, EntityManager entityManager) {
        this.repository = productRepository;
        this.entityManager = entityManager;
    }

    public ProductService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Product insert(Product product) {
        Product save = repository.save(product);
        return save;
    }

    public Product findById(UUID id) {
        return repository.findById(id).orElse(null);
    }

    public List<Product> findAll(boolean isDeleted) {
        Session session = entityManager.unwrap(Session.class);
        Filter filter = session.enableFilter("deletedProductFilter");
        filter.setParameter("isDeleted", isDeleted);
        List<Product> product = repository.findAll();
        session.disableFilter("deletedProductFilter");
        return product;
    }

    public Product update(UUID id, Product product) {
        Product productUpdated = repository.findById(id).orElse(null);
        if (productUpdated != null) {
            productUpdated.setName(product.getName());
            productUpdated.setValue(product.getValue());
            productUpdated.setWeight(product.getWeight());
            repository.save(productUpdated);
            return productUpdated;
        } else {
            throw new RuntimeException("Não foi possível atualizar o registro");
        }
    }

    public void delete(UUID id) {
        repository.deleteById(id);
    }

}
