package com.example.repository.impl;

import com.example.model.EmailBox;
import com.example.repository.IEmailBoxRepository;
import org.springframework.stereotype.Repository;

@Repository
public class EmailBoxRepository implements IEmailBoxRepository {
    @Override
    public void save(EmailBox emailBox) {
            emailBox.getLenguages();
    }
}
