package com.example.bai_tap1.service.impl;

import com.example.bai_tap1.model.Category;
import com.example.bai_tap1.repository.ICategoryRepository;
import com.example.bai_tap1.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    ICategoryRepository iCategoryRepository;

    @Override
    public Page<Category> findAll(Pageable pageable) {
        return iCategoryRepository.findAll(pageable);
    }

    @Override
    public List<Category> findCategory() {
        return iCategoryRepository.findAll();
    }
}
