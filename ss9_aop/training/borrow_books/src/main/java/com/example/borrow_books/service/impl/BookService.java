package com.example.borrow_books.service.impl;

import com.example.borrow_books.model.Book;
import com.example.borrow_books.model.DetailBook;
import com.example.borrow_books.repository.IBookRepository;
import com.example.borrow_books.repository.IDetailBookRepository;
import com.example.borrow_books.service.IBookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService {
    @Autowired
    private IBookRepository bookRepository;

    @Autowired
    private IDetailBookRepository detailBookRepository;

    @Override
    public List<Book> findAll() {
        return this.bookRepository.findAll();
    }

    @Override
    public void save(Book book) {
        this.bookRepository.save(book);
    }

    @Override
    public void borrowBook(Integer id) {
        Book book = this.bookRepository.getById(id);
        if (this.detailBookRepository.existsById(id)){
            for (int i = 0; i < book.getQuantity(); i++) {
                List<DetailBook> detailBooks = this.detailBookRepository.findAll();
                DetailBook detailBook = new DetailBook();
                detailBook.setBookCode(getRandomNumber(detailBooks));
                detailBook.setStatus(false);
                detailBook.setBook(book);
                this.detailBookRepository.save(detailBook);
            }
        }
    }

    @Override
    public void setQuantity(Integer id) {
        this.bookRepository.setQuantity(this.detailBookRepository.getById(id).getBook().getId());
    }

    private int getRandomNumber(List<DetailBook> detailBooks) {
        int randomNumber = 10000;
        while (checkExists(detailBooks, randomNumber)) {
            randomNumber = (int) ((Math.random() * 89999) + 10001);
        }
        return randomNumber;
    }

    private boolean checkExists(List<DetailBook> detailBooks, int randomNumber) {
        for (DetailBook detailBook : detailBooks) {
            if (detailBook.getBookCode() == randomNumber) {
                return true;
            }
        }
        return false;
    }
}
