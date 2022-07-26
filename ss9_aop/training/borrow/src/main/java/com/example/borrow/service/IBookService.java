package com.example.borrow.service;

import com.example.borrow.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> findAll();

    void save(Book book);

    void borrowBook(Integer id);

    void setQuantity(Integer id);

    void setStatus(Integer id);
}
