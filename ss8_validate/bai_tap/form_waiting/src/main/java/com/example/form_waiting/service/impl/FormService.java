package com.example.form_waiting.service.impl;

import com.example.form_waiting.model.FormWaiting;
import com.example.form_waiting.repository.IFormRepository;
import com.example.form_waiting.service.IFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormService implements IFormService {

    @Autowired
    private IFormRepository iFormRepository;

    @Override
    public List<FormWaiting> findAll() {
        return this.iFormRepository.findAll();
    }

    @Override
    public void save(FormWaiting formWaiting) {
        iFormRepository.save(formWaiting);
    }
}
