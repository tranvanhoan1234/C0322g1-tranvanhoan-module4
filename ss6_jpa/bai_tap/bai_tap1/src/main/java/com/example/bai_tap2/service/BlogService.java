package com.example.bai_tap2.service;

import com.example.bai_tap2.model.Blog;
import com.example.bai_tap2.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogSevice {
    @Autowired
    IBlogRepository iBlogRepository;

    @Override
    public List<Blog> findAll() {
        return iBlogRepository.findAllBlog();
    }

    @Override
    public void save(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public void delete(Integer id) {
        iBlogRepository.delete(id);
    }

    @Override
    public Blog findByIdd(Integer id) {
        return iBlogRepository.findByIdd(id);
    }

    @Override
    public void edit(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public List<Blog> findByName(String name) {
        return iBlogRepository.findByName("%" + name + "%");
    }

}
