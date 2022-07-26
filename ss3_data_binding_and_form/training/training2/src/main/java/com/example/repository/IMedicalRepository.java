package com.example.repository;

import com.example.model.MedicalDeclarationForm;

import java.util.List;

public interface IMedicalRepository {


    String[] getGender();


    String save(MedicalDeclarationForm medicalDeclarationForm);

    List<MedicalDeclarationForm> findById(Integer id);

    void update(MedicalDeclarationForm medicineClare);
}
