package com.example.form_waiting.form_dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class FormDto implements Validator {
    private Integer id;

    @NotBlank(message = "no first name blank")
    @Pattern(regexp = "^\\w{5,45}$", message = "tối đã 6 >45 kí tưej")
    private String firstname;

    @NotBlank(message = "no last name blank")
    @Pattern(regexp = "^\\w{5,45}$", message = "tối đã 6 >45 kí tưej")
    private String lastname;

    @NotBlank(message = "no phone")
    @Pattern(regexp = "^0\\d{9}$", message = "10 so")
    private String phoneNumber;

    @NotBlank(message = "Nhập đi thằng ngu")
    private String age;

    @Email
    @NotBlank(message = "NO EMAIL")
    private String email;

    public FormDto() {
    }

    public FormDto(Integer id, String firstname, String lastname, String phoneNumber, String age, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        FormDto formDto = (FormDto) target;
        String pattern = "yyyy-MM-dd";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        LocalDate birthday = LocalDate.parse(formDto.age, formatter);
        LocalDate now = LocalDate.now();
        int age = Period.between(birthday, now).getYears();
        if (age < 18 || age > 100) {
            errors.rejectValue("age", "age", "Nhập ngu ngày sinh phải từ 18 - 100!");
        }
    }
}
