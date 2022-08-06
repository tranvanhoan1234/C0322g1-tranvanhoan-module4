package com.example.case_study.dto;

import com.example.case_study.model.employee.Division;
import com.example.case_study.model.employee.EducationDegree;
import com.example.case_study.model.employee.Position;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;

public class EmployeeDto {
    private int id;
    @NotBlank
    @Pattern(regexp = "^([A-Z][^A-Z0-9\\s]+)(\\s[A-Z][^A-Z0-9\\s]+)*$", message = "Viết hoa chữ cái đầu")
    private String namEmployee;

    @NotNull
    @DateTimeFormat
    private String dateOfBirth;

    @NotNull
    @Pattern(regexp = "[0-9]{9}|[0-9]{12}",message = "Bắt đầu bằng 09 có 9 hoặc 12 số")
    private String idCard;

    @PositiveOrZero
    private Double salary;

    @NotNull
    @Pattern(regexp ="^(090|091|\\(84\\)\\+90|\\(84\\)\\+91)\\d{7}$",message = "Số điện thoại phải đúng định dạng 090xxxxxxx hoặc 091xxxxxxx hoặc\n" +
            "(84)+90xxxxxxx hoặc (84)+91xxxxxxx.")
    private String phoneNumber;

    @NotNull
    @Email
    private String email;

    @NotBlank
    @NotNull
    private String address;

    @NotNull
    private Division division;

    @NotNull
    private EducationDegree educationDegree;

    @NotNull
    private Position position;

    private int status;

    public EmployeeDto() {
    }

    public EmployeeDto(int id, String namEmployee, String dateOfBirth, String idCard, Double salary, String phoneNumber, String email, String address, Division division, EducationDegree educationDegree, Position position, int status) {
        this.id = id;
        this.namEmployee = namEmployee;
        this.dateOfBirth = dateOfBirth;
        this.idCard = idCard;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.division = division;
        this.educationDegree = educationDegree;
        this.position = position;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamEmployee() {
        return namEmployee;
    }

    public void setNamEmployee(String namEmployee) {
        this.namEmployee = namEmployee;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
