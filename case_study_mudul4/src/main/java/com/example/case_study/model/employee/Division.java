package com.example.case_study.model.employee;

import javax.persistence.*;
import java.util.List;

@Entity
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDivision;
    private String nameDivision;
    @OneToMany(mappedBy = "division")
    private List<Employee> employeeList;

    public Division() {
    }

    public Division(Integer idDivision, String nameDivision, List<Employee> employeeList) {
        this.idDivision = idDivision;
        this.nameDivision = nameDivision;
        this.employeeList = employeeList;
    }

    public Integer getIdDivision() {
        return idDivision;
    }

    public void setIdDivision(Integer idDivision) {
        this.idDivision = idDivision;
    }

    public String getNameDivision() {
        return nameDivision;
    }

    public void setNameDivision(String nameDivision) {
        this.nameDivision = nameDivision;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
