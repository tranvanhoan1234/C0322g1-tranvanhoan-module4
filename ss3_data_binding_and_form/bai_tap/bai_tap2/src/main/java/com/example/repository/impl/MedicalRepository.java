package com.example.repository.impl;

import com.example.model.MedicalDeclarationForm;
import com.example.repository.IMedicalRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MedicalRepository implements IMedicalRepository {
   private static List<MedicalDeclarationForm>medicalDeclarationForms=new ArrayList<>();

    static {
        medicalDeclarationForms.add(new MedicalDeclarationForm("dong","1997","nam","việt nam","56123123","thông tin đi lại :đn-hue","vn1123","10","12-21-1996","12-1-1993","tt di lai"));
        medicalDeclarationForms.add(new MedicalDeclarationForm("hoang","1997","nữ","nam","56123123","thông tin đi lại :đn-hue","vn1123","10","12-21-1996","12-1-1993","tt di lai"));
        medicalDeclarationForms.add(new MedicalDeclarationForm("tien","1997","bd","việt ","56123123","thông tin đi lại :đn-hue","vn1123","10","12-21-1996","12-1-1993","tt di lai"));
        medicalDeclarationForms.add(new MedicalDeclarationForm("dat","1997","nam"," nam","56123123","thông tin đi lại :đn-hue","vn1123","10","12-21-1996","12-1-1993","tt di lai"));
        medicalDeclarationForms.add(new MedicalDeclarationForm("van","1997","nữ","việt nam","56123123","thông tin đi lại :đn-hue","vn1123","10","12-21-1996","12-1-1993","tt di lai"));

    }


    @Override
    public void create(MedicalDeclarationForm medicalDeclarationForm) {
       medicalDeclarationForms.add(medicalDeclarationForm);
    }
}
