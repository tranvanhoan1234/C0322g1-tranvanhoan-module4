package com.example.repository;

import com.example.modle.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

    void update(Product product);

    void remove(Integer id);

    List<Product> search(String s);
}
