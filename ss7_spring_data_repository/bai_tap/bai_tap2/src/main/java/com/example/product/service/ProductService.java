package com.example.product.service;

import com.example.product.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    Page<Product> findAll(Pageable pageable, String search);

    void save(Product product);

//    List<Product> findByName(String s);
//
//    void delete(Integer id);
//
//    void save(Product product);
//
//    void edit(Product product);
//
//    Product findById(Integer id);
}
