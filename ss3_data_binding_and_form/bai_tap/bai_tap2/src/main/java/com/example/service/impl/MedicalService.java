package com.example.service.impl;

import com.example.model.MedicalDeclarationForm;
import com.example.repository.IMedicalRepository;
import com.example.service.IMedicalService;
import org.springframework.stereotype.Service;

@Service
public class MedicalService implements IMedicalService {
    IMedicalRepository iMedicalRepository;

    @Override
    public String[] getGender() {
        return iMedicalRepository.getGender();
    }

    @Override
    public void save(MedicalDeclarationForm medicalDeclarationForm) {
        iMedicalRepository.save(medicalDeclarationForm);
    }

}
