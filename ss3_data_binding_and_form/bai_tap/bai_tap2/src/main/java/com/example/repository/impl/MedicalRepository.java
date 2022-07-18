package com.example.repository.impl;

import com.example.model.MedicalDeclarationForm;
import com.example.repository.IMedicalRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MedicalRepository implements IMedicalRepository {
    static List<MedicalDeclarationForm> medicalDeclarationForms;

    static {
        medicalDeclarationForms.add(new MedicalDeclarationForm("hoan", "1999-12-12", "1", "1", "112321312", "1", "112312312", "1", "1123", "1-12-1232", "11"));
        medicalDeclarationForms.add(new MedicalDeclarationForm("tuan", "1999-12-12", "1", "1", "112321312", "1", "112312312", "1", "1123", "1-12-1232", "11"));
        medicalDeclarationForms.add(new MedicalDeclarationForm("hoang", "1999-12-12", "1", "1", "112321312", "1", "112312312", "1", "1123", "1-12-1232", "11"));
        medicalDeclarationForms.add(new MedicalDeclarationForm("viet", "1999-12-12", "1", "1", "112321312", "1", "112312312", "1", "1123", "1-12-1232", "11"));
        medicalDeclarationForms.add(new MedicalDeclarationForm("tong", "1999-12-12", "1", "1", "112321312", "1", "112312312", "1", "1123", "1-12-1232", "11"));

    }

    @Override
    public String[] getGender() {
        String[] gender = {"Nam", "Nu", "Khac"};
        return gender;
    }

    @Override
    public String save(MedicalDeclarationForm medicalDeclarationForm) {
        return String.valueOf(medicalDeclarationForm);
    }
}
