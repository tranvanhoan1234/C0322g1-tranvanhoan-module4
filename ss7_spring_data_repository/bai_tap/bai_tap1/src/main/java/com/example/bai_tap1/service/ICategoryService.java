package com.example.bai_tap1.service;

import com.example.bai_tap1.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICategoryService {

    Page<Category> findAll(Pageable pageable);

    List<Category> findCategory();

}
