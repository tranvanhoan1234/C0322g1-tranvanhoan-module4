package com.example.case_study.service.education.impl;

import com.example.case_study.model.employee.EducationDegree;
import com.example.case_study.repository.education.IEducationRepository;
import com.example.case_study.service.education.IEducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService implements IEducationService {
    @Autowired
    IEducationRepository iEducationRepository;
    @Override
    public List<EducationDegree> findAll() {
        return iEducationRepository.findAll();
    }
}
