package com.example.bai_tap1.service.impl;

import com.example.bai_tap1.model.Blog;
import com.example.bai_tap1.repository.IBlogRepository;
import com.example.bai_tap1.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BlogService implements IBlogService {
    @Autowired
    IBlogRepository iBlogRepository;
    @Override
    public Page<Blog> findAll(Pageable pageable, String search) {
        return iBlogRepository.findAll(pageable, "%"+search+"%");
    }

    @Override
    public void save(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public void deleteById(Integer id) {
        iBlogRepository.deleteById(id);
    }
}
