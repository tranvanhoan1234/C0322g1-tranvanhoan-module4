package com.example.case_study.service.employee.impl;

import com.example.case_study.model.employee.Employee;
import com.example.case_study.repository.employee.IEmployeeRepository;
import com.example.case_study.service.employee.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {
@Autowired
    IEmployeeRepository iEmployeeRepository;
    @Override
    public List<Employee> findAll() {
        return iEmployeeRepository.findAll();
    }
}
