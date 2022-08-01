package com.example.blog_security.service.impl;

import com.example.blog_security.model.Category;
import com.example.blog_security.repository.ICategoryRepository;
import com.example.blog_security.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository iCategoryRepository;
    @Override
    public List<Category> findCategory() {
        return iCategoryRepository.findAll();
    }
}
