package com.example.product.service.impl;

import com.example.product.model.Product;
import com.example.product.repository.IProductRepository;
import com.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class IProductService implements ProductService {


    @Autowired
    IProductRepository iProductRepository;

    @Override
    public Page<Product> findAll(Pageable pageable, String search) {
        return iProductRepository.findAll(pageable, "%" + search + "%");
    }

    @Override
    public void save(Product product) {
        iProductRepository.save(product);
    }

//    @Override
//    public List<Product> findByName(String s) {
//        return iProductRepository.findByName(s);
//    }
//
//    @Override
//    public void delete(Integer id) {
//        iProductRepository.delete(id);
//    }
//
//    @Override
//    public void save(Product product) {
//        iProductRepository.save(product);
//    }

//    @Override
//    public void edit(Product product) {
//        iProductRepository.edit(product);
//    }

//    @Override
//    public Product findById(Integer id) {
//        return iProductRepository.findById(id);
//    }
}
