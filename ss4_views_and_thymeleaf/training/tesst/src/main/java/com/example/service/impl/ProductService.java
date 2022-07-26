package com.example.service.impl;

import com.example.model.Product;
import com.example.repository.IProductRypository;
import com.example.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    IProductRypository iProductRypository;
    @Override
    public List<Product> findAll() {
        return iProductRypository.findAll();
    }

    @Override
    public List<Product> findByName(String s) {
        return iProductRypository.findByName(s);
    }

    @Override
    public void delete(Integer id) {
        iProductRypository.delete(id);
    }
    @Override
    public void save(Product product) {
        iProductRypository.save(product);
    }

    @Override
    public void edit(Product product) {
        iProductRypository.edit(product);
    }

    @Override
    public Product findById(Integer id) {
        return iProductRypository.findById(id);
    }
}
