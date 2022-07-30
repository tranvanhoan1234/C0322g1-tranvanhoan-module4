package com.example.blog.repository;

import com.example.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    @Query(value = " select * from blog where title like :searchParam ", nativeQuery = true,
            countQuery = " select count(*) from (select * from blog where title like :searchParam ) temp_table ")
    Page<Blog> findByidd(@Param( "searchParam") String searchParam, Pageable pageable);
}
