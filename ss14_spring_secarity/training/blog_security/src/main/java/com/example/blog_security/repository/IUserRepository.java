package com.example.blog_security.repository;

import com.example.blog_security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {
User findByUserName(String name);
}
