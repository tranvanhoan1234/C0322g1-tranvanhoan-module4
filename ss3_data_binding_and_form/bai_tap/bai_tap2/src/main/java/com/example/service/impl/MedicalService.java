package com.example.service.impl;

import com.example.model.MedicalDeclarationForm;
import com.example.repository.IMedicalRepository;
import com.example.service.IMedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicalService implements IMedicalService {
    @Autowired
    IMedicalRepository iMedicalRepository;
    @Override
    public void create(MedicalDeclarationForm medicalDeclarationForm) {
         iMedicalRepository.create(medicalDeclarationForm);
    }
}
