package com.example.case_study.model.employee;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class EducationDegree {
    @Id
    private Integer idEducation;
    private String nameEducation;
    @OneToMany(mappedBy = "educationDegree")
    private List<Employee> employeeList;

    public EducationDegree() {
    }

    public EducationDegree(Integer idEducation, String nameEducation, List<Employee> employeeList) {
        this.idEducation = idEducation;
        this.nameEducation = nameEducation;
        this.employeeList = employeeList;
    }

    public Integer getIdEducation() {
        return idEducation;
    }

    public void setIdEducation(Integer idEducation) {
        this.idEducation = idEducation;
    }

    public String getNameEducation() {
        return nameEducation;
    }

    public void setNameEducation(String nameEducation) {
        this.nameEducation = nameEducation;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
