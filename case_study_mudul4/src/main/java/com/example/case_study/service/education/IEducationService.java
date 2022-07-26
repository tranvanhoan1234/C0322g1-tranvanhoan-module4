package com.example.case_study.service.education;

import com.example.case_study.model.employee.EducationDegree;

import java.util.List;

public interface IEducationService {
    List<EducationDegree> findAll();
}
