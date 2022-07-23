package com.example.bai_tap1.repository;

import com.example.bai_tap1.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlogRepository extends JpaRepository<Blog,Integer> {
@Query(value = "select * from blog where blog_name like :search",nativeQuery = true,
countQuery = "select count(*) from (select * from blog where blog_name like :search) table_name ")
   Page<Blog> findAll(Pageable pageable ,String search);


}
