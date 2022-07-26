package com.example.borrow.service.impl;

import com.example.borrow.model.Book;
import com.example.borrow.model.DetailBook;
import com.example.borrow.repository.IBookRepository;
import com.example.borrow.repository.IDeTailBookRepository;
import com.example.borrow.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService {
    @Autowired
    IBookRepository iBookRepository;
    @Autowired
    IDeTailBookRepository iDeTailBookRepository;

    @Override
    public List<Book> findAll() {
        return iBookRepository.findAll();
    }

    @Override
    public void save(Book book) {
        iBookRepository.save(book);
    }

    @Override
    public void borrowBook(Integer id) {
        Book book = this.iBookRepository.getById(id);
        if (this.iDeTailBookRepository.existsById(id)) {
            for (int i = 0; i < book.getQuantity(); i++) {
                List<DetailBook> detailBooks = this.iDeTailBookRepository.findAll();
                DetailBook detailBook = new DetailBook();
                detailBook.setBookCode(getRandomNumber(detailBooks));
                detailBook.setStatus(false);
                detailBook.setBook(book);
                this.iDeTailBookRepository.save(detailBook);
            }
        }
    }



        @Override
        public void setQuantity(Integer id) {
            this.iBookRepository.setQuantity(this.iDeTailBookRepository.getById(id).getBook().getId());
    }

    @Override
    public void setStatus(Integer id) {
        this.iDeTailBookRepository.setStatus(id);
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
