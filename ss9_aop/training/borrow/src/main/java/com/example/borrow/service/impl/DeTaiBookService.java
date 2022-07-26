package com.example.borrow.service.impl;

import com.example.borrow.model.DetailBook;
import com.example.borrow.repository.IDeTailBookRepository;
import com.example.borrow.service.IDeTaiBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeTaiBookService implements IDeTaiBookService {
    @Autowired
    IDeTailBookRepository iDeTailBook;
    @Override
    public List<DetailBook> findAll() {
        return iDeTailBook.findAll();
    }
}
