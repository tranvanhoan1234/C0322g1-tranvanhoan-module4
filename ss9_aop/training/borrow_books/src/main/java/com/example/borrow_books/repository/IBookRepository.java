package com.example.borrow_books.repository;

import com.example.borrow_books.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface IBookRepository extends JpaRepository<Book, Integer> {
@Modifying
    @Transactional
    @Query(value = " UPDATE book SET quantity = quantity - 1 WHERE (id = :id);  " ,nativeQuery = true)
    void setQuantity(@Param("id") Integer id);

    @Modifying
    @Transactional
    @Query(value = " UPDATE book SET quantity = quantity + 1 WHERE (id = :id);  " ,nativeQuery = true)
    void updateQuantity(@Param("id") Integer id);
}
