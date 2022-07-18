package com.example.service;

import com.example.model.MedicalDeclarationForm;

public interface IMedicalService {


    String[] getGender();

    void save(MedicalDeclarationForm medicalDeclarationForm);

}
