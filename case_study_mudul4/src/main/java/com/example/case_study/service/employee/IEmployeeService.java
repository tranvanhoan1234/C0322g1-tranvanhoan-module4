package com.example.case_study.service.employee;

import com.example.case_study.model.employee.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {
    List<Employee> findAll();

    void save(Employee employee);

    void delete(Integer id);


    Optional<Employee> findById(Integer id);
}
