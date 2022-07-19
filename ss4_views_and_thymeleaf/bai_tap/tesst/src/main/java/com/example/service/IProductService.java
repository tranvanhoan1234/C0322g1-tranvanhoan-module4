package com.example.service;

import com.example.modle.Product;

import java.util.List;

public interface IProductService {


    List<Product> findAll();

    List<Product> findByName(String s);

    void delete(int id);
}
