package com.example.repository;

import com.example.model.MedicalDeclarationForm;

public interface IMedicalRepository {


    String[] getGender();


    String save(MedicalDeclarationForm medicalDeclarationForm);

}
