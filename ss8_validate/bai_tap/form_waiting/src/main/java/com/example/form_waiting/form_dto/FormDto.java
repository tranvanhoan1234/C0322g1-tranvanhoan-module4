package com.example.form_waiting.form_dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class FormDto implements Validator {
    private Integer id;
    @NotBlank(message = "no first name blank")
    private String firstname;
    @NotBlank(message = "no last name blank")
    private String lastname;
    @NotBlank(message = "no phone")
    private String phoneNumber;
    @Min(value = 18,message = "age > 18")
    @Max(value = 100,message = "age<100")
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
        FormDto formDto=(FormDto) target;
        String firstName=formDto.getFirstname();
        if (!firstName.matches("^\\w{5,45}$")){
            errors.rejectValue("firstName", "firstName.rejected", "tối đã 6 >45 kí tưej");
        }
        String lastName = formDto.getLastname();
        if (!lastName.matches("^\\w{5,45}$")) {
            errors.rejectValue("lastName", "lastName.rejected", "tối da 6 > 56 kí tự");
        }

        String phoneNumber = formDto.getPhoneNumber();
        if (!phoneNumber.matches("^0\\d{9}$")) {
            errors.rejectValue("phone", "phone.rejected", "10 số");
        }
    }
}
