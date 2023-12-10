package com.br.ufrn.demo.service;

import com.br.ufrn.demo.model.ShoppingCart;
import com.br.ufrn.demo.repository.ShoppingCartRepository;
import jakarta.persistence.EntityManager;
import org.hibernate.Filter;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartService {
    ShoppingCartRepository repository;

    @Autowired
    private EntityManager entityManager;

    public ShoppingCartService(ShoppingCartRepository repository){
        this.repository = repository;
    }

    public ShoppingCart insert(ShoppingCart shoppingCart){
        ShoppingCart save = repository.save(shoppingCart);
        return save;
    }

    public ShoppingCart findById(Long id){
        return repository.findById(id).orElse(null);
    }

    public List<ShoppingCart> findAll(boolean isDeleted){
        Session session = entityManager.unwrap(Session.class);
        Filter filter = session.enableFilter("deletedShoppingCartFilter");
        filter.setParameter("isDeleted", isDeleted);
        List<ShoppingCart> shoppingCart = repository.findAll();
        session.disableFilter("deletedShoppingCartFilter");
        return shoppingCart;
    }

    public ShoppingCart update(Long id, ShoppingCart shoppingCart){
        ShoppingCart shoppingCartUpdated = repository.findById(id).orElse(null);
        if(shoppingCartUpdated != null){
            shoppingCartUpdated.setCostumer(shoppingCart.getCostumer());
            shoppingCartUpdated.setProducts(shoppingCart.getProducts());
            shoppingCartUpdated = updateTotals(shoppingCartUpdated);
            repository.save(shoppingCartUpdated);
            return shoppingCartUpdated;
        }else{
            throw new RuntimeException("Não foi possível atualizar o registro");
        }
    }

    public ShoppingCart updateTotals(ShoppingCart shoppingCart){
        shoppingCart.setTotal_value(0f);
        shoppingCart.setTotal_weight(0f);
        for(var product : shoppingCart.getProducts()){
            shoppingCart.setTotal_value(shoppingCart.getTotal_value() + product.getValue());
            shoppingCart.setTotal_weight(shoppingCart.getTotal_weight() + product.getWeight());
        }
        return shoppingCart;
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public Float checkout(Long id){
        ShoppingCart shoppingCart = repository.findById(id).orElse(null);
        if(shoppingCart != null){
            Float total = shoppingCart.getTotal_value();
            repository.delete(shoppingCart);
            return total;
        }else{
            throw new RuntimeException("Não foi possível realizar o checkout");
        }
    }
}