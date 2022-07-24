package com.example.product1.service;

import com.example.product1.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProductService {
    Page<Product> findAll(Pageable pageable, String search);

    void save(Product product);

}
