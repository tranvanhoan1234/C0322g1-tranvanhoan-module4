package com.example.blog.service.impl;

import com.example.blog.model.Blog;
import com.example.blog.repository.IBlogRepository;
import com.example.blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService implements IBlogService {
    @Autowired
    IBlogRepository iBlogRepository;
    @Override
    public List<Blog> findAll() {
        return iBlogRepository.findAll();
    }

    @Override
    public Optional<Blog> findById(Integer id) {
        return iBlogRepository.findById(id);
    }


    @Override
    public void save(Blog currentBlog) {

    }
}
