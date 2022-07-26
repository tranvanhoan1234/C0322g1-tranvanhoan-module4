package com.example.case_study.model.employee;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Position {
    @Id
    private Integer idPosition;
    private String namePosition;
    @OneToMany(mappedBy = "position")
    private List<Employee>employeeList;
    public Position() {
    }

    public Position(Integer idPosition, String namePosition, List<Employee> employeeList) {
        this.idPosition = idPosition;
        this.namePosition = namePosition;
        this.employeeList = employeeList;
    }

    public Integer getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(Integer idPosition) {
        this.idPosition = idPosition;
    }

    public String getNamePosition() {
        return namePosition;
    }

    public void setNamePosition(String namePosition) {
        this.namePosition = namePosition;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
