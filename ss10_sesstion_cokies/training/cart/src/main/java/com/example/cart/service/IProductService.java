package com.example.cart.service;

import com.example.cart.model.Product;
import com.example.cart.model.ProductDto;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    List<Product> findAll();

    Optional<Product> findById(Long id);

    void save(Product product);

}
