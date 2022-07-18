package com.example.service;

import com.example.model.MedicalDeclarationForm;

import java.util.List;

public interface IMedicalService {


    String[] getGender();

    void save(MedicalDeclarationForm medicalDeclarationForm);

    List<MedicalDeclarationForm> findById(Integer id);

    void update(MedicalDeclarationForm medicineClare);
}
