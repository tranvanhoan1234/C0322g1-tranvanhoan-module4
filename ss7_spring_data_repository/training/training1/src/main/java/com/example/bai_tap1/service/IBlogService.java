package com.example.bai_tap1.service;

import com.example.bai_tap1.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBlogService {
    Page<Blog> findAll(Pageable pageable ,String search);

    void save(Blog blog);

    void deleteById(Integer id);
}
