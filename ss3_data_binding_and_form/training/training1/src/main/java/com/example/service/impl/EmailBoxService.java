package com.example.service.impl;

import com.example.model.EmailBox;
import com.example.repository.IEmailBoxRepository;
import com.example.service.IEmailBoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailBoxService implements IEmailBoxService {
    @Autowired
    IEmailBoxRepository iEmailBoxRepository;

    @Override
    public void save(EmailBox emailBox) {
        iEmailBoxRepository.save(emailBox);
    }
}
