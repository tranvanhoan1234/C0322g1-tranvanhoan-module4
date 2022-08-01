package com.example.blog_security.service;

import com.example.blog_security.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    void save(Blog blog);

    void delete(Integer id);
}
