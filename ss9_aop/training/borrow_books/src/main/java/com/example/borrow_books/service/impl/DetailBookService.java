package com.example.borrow_books.service.impl;

import com.example.borrow_books.model.DetailBook;
import com.example.borrow_books.repository.IBookRepository;
import com.example.borrow_books.repository.IDetailBookRepository;
import com.example.borrow_books.service.IDetailBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class DetailBookService implements IDetailBookService {
    @Autowired
    IDetailBookRepository iDetailBookRepository;
    @Autowired
    private IBookRepository bookRepository;

    @Override
    public List<DetailBook> findAll() {
        return this.iDetailBookRepository.findAll();
    }

    @Override
    public void setStatus(Integer id) {
        this.iDetailBookRepository.setStatus(id);
    }

    @Override
    public void returnBook(Integer bookCode) throws Exception {
        List<DetailBook> detailBooks = this.iDetailBookRepository.findAll();
        DetailBook detailBook = this.iDetailBookRepository.getByBookCode(bookCode);
        if (checkBookCodeExists(bookCode,detailBooks)) {
            this.iDetailBookRepository.updateStatus(detailBook.getId());
            this.bookRepository.updateQuantity(detailBook.getBook().getId());
        } else {
            throw new Exception();
        }
    }

    @Override
    public List<DetailBook> findByCode(Integer code) {
        return iDetailBookRepository.findAllById(Collections.singleton(code));
    }

    @Override
    public void repay(Integer code) {

    }

    private boolean checkBookCodeExists(Integer bookCode, List<DetailBook> detailBooks) {
        for (DetailBook detailBook: detailBooks) {
            if (detailBook.getBookCode().equals(bookCode) && detailBook.getStatus()) {
                return true;
            }
        }
        return false;
    }
}
