package com.example.case_study.model.employee;

import com.example.case_study.model.contract.Contract;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;


@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nameEmployee;
    private Date birthdayEmployee;
    private Double salary;
    private String idCard;
    private String email;
    private String address;
    private String phoneNumber;

    @Column(columnDefinition = "bit(1) default 0")
    private Byte status;
    @ManyToOne
    @JoinColumn(name = "id_division", referencedColumnName = "idDivision")
    private Division division;
    @ManyToOne
    @JoinColumn(name = "id_position", referencedColumnName = "idPosition")
    private Position position;
    @ManyToOne
    @JoinColumn(name = "id_education", referencedColumnName = "idEducation")
    private EducationDegree educationDegree;
    @OneToMany(mappedBy = "employee")
    @JsonBackReference
    private List<Contract> contractList;
    public Employee() {
    }

    public Employee(Integer id, String nameEmployee, Date birthdayEmployee, Double salary, String idCard, String email, String address, String phoneNumber, Byte status, Division division, Position position, EducationDegree educationDegree, List<Contract> contractList) {
        this.id = id;
        this.nameEmployee = nameEmployee;
        this.birthdayEmployee = birthdayEmployee;
        this.salary = salary;
        this.idCard = idCard;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.status = status;
        this.division = division;
        this.position = position;
        this.educationDegree = educationDegree;
        this.contractList = contractList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public Date getBirthdayEmployee() {
        return birthdayEmployee;
    }

    public void setBirthdayEmployee(Date birthdayEmployee) {
        this.birthdayEmployee = birthdayEmployee;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }
}
