package com.example.bai_tap2.service;

import com.example.bai_tap2.model.Blog;

import java.util.List;

public interface IBlogSevice {
    List<Blog> findAll();

    void save(Blog blog);

    void delete(Integer id);

    Blog findByIdd(Integer id);

    void edit(Blog blog);

    List<Blog> findByName(String name);


}
