package com.example.product1.repository;

import com.example.product1.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<Product,Integer> {


    @Query(value = "select * from product where name like :search", nativeQuery = true,
            countQuery = "select count(*) from (select * from product where name like :search) product ")
    Page<Product> findAll(Pageable pageable, String search);

}
