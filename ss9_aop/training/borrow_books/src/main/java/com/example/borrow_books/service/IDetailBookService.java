package com.example.borrow_books.service;

import com.example.borrow_books.model.DetailBook;

import java.util.List;

public interface IDetailBookService {
    List<DetailBook> findAll();

    void setStatus(Integer id);

    void returnBook(Integer bookCode) throws Exception;
    void repay(Integer code);

    List<DetailBook> findByCode(Integer code);
}
