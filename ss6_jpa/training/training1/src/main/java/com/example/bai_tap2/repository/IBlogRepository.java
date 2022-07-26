package com.example.bai_tap2.repository;

import com.example.bai_tap2.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    @Query(value = "select  * from Blog ", nativeQuery = true)
    List<Blog> findAllBlog();

    @Modifying
    @Query(value = "update Blog set status = 1 where id = :id", nativeQuery = true)
    void delete(@Param("id") Integer id);

    @Query(value = "select * from Blog where id = :id", nativeQuery = true)
    Blog findByIdd(@Param("id") Integer id);

    @Query(value = "select  * from blog where blog_name like :name ", nativeQuery = true)
    List<Blog> findByName(@Param("name") String name);

//    @Modifying
//    @Query(value = " update blog set status = 1 where id = :id", nativeQuery = true)
//    void delete(@Param("id") Integer id);
//@Query(value = "")
//    @Query(value = "select * from Student where name = :keyword", nativeQuery = true)
//    List<Blog> searchByName(@Param("keyword") String name);

}