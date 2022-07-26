package com.example.borrow_books.service.impl;

import com.example.borrow_books.model.GhostBook;
import com.example.borrow_books.repository.IGhostRepository;
import com.example.borrow_books.service.IGhostBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GhostBookService implements IGhostBookService {
    @Autowired
    IGhostRepository iGhostRepository;

    @Override
    public List<GhostBook> findAll() {
        return iGhostRepository.findAll();
    }
}
