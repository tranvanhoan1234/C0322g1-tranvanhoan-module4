package com.example.borrow_books.service;

import com.example.borrow_books.model.Book;

import java.util.List;
import java.util.Optional;

public interface IBookService {
    List<Book> findAll();

    void save(Book book);

    void borrowBook(Integer id);

    void setQuantity(Integer id);

    Optional<Book> findById(int id);

    void repay(Book book);

}
