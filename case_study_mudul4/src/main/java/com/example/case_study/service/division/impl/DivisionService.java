package com.example.case_study.service.division.impl;

import com.example.case_study.model.employee.Division;
import com.example.case_study.repository.division.IDivisionRepository;
import com.example.case_study.service.division.IDivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionService implements IDivisionService {
    @Autowired
    IDivisionRepository iDivisionRepository;
    @Override
    public List<Division> findAll() {
        return iDivisionRepository.findAll();
    }
}
