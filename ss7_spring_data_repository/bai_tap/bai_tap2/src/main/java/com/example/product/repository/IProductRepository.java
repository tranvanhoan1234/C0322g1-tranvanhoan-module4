package com.example.product.repository;

import com.example.product.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<Product, Integer> {
    @Query(value = "select * from product where name like :search", nativeQuery = true,
            countQuery = "select count(*) from (select * from product where name like :search) table_name ")
    Page<Product> findAll(Pageable pageable, String search);
//
//    List<Product> findByName(String s);
//
//    void delete(Integer id);
//
//    void save(Product product);
//    void edit(Product product);
//
//   List<Product> findById(Integer id);
}
