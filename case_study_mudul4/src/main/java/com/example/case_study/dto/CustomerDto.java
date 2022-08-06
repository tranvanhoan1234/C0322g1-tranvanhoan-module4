package com.example.case_study.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.sql.Date;

public class CustomerDto {
    private Integer id;
    @NotEmpty
    @Pattern(regexp = "^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$", message = "Wrong format")
    private String name;
    @NotEmpty
    @Pattern(regexp = "^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$", message = "Wrong format")
    @NotEmpty
    private String address;
    private Date birthday;
    @NotEmpty
    private String email;
    private Integer gender;
    @NotEmpty
    @Pattern(regexp = "^[0-9]{9}")
    private String idCard;
    @NotEmpty
    @Pattern(regexp = "^(((\\+|)84)|0)(3|5|7|8|9)+([0-9]{8})$", message = "sai định dạng 9 numbers")
    private String phoneNumber;
    private byte status;
    @NotEmpty
    private String customerTypes;

    public CustomerDto() {
    }

    public CustomerDto(Integer id, String name, String address, Date birthday, String email, Integer gender, String idCard, String phoneNumber, byte status, String customerTypes) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.birthday = birthday;
        this.email = email;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.status = status;
        this.customerTypes = customerTypes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public String getCustomerTypes() {
        return customerTypes;
    }

    public void setCustomerTypes(String customerTypes) {
        this.customerTypes = customerTypes;
    }
}
