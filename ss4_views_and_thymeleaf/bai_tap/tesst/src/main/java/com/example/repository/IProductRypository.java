package com.example.repository;

import com.example.modle.Product;

import java.util.List;

public interface IProductRypository  {
    List<Product> findAll();

    List<Product> findByName(String s);

    void delete(int id);
}
