package com.example.product1.service.impl;

import com.example.product1.model.Product;
import com.example.product1.repository.IProductRepository;
import com.example.product1.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {
    @Autowired
    IProductRepository iProductRepository;
    @Override
    public Page<Product> findAll(Pageable pageable, String search) {
        return iProductRepository.findAll(pageable,"%"+search+"%");
    }

    @Override
    public void save(Product product) {
        iProductRepository.save(product);
    }
}
