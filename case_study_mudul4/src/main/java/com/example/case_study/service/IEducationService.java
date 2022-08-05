package com.example.case_study.service;

import com.example.case_study.model.employee.EducationDegree;

import java.util.List;

public interface IEducationService {
    List<EducationDegree> findAll();
}
