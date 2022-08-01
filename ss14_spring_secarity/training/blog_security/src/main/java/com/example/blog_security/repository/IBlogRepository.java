package com.example.blog_security.repository;

import com.example.blog_security.model.Blog;
import com.example.blog_security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface IBlogRepository extends JpaRepository<Blog,Integer> {

}
