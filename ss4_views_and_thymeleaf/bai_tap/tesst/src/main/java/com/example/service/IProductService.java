package com.example.service;

import com.example.model.Product;

import java.util.List;

public interface IProductService {


    List<Product> findAll();

    List<Product> findByName(String s);

    void delete(Integer id);

    void save(Product product);
    void edit(Product product);

    Product findById(Integer id);

}
