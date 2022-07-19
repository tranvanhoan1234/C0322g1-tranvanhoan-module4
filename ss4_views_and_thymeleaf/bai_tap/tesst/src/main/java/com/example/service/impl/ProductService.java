package com.example.service.impl;

import com.example.modle.Product;
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
    public void delete(int id) {
      iProductRypository.delete(id);
    }
}
