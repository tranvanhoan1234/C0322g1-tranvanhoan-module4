package com.example.case_study.model.customer;

import com.example.case_study.model.Contract;
import com.example.case_study.model.employee.User;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String address;
    private Date birthday;
    private String email;
    private Integer gender;
    private String idCard;
    private String phoneNumber;
    @Column(columnDefinition = "bit(1) default 0")
    private byte status;
    @ManyToOne
    @JoinColumn(name = "customer_type_id", referencedColumnName = "id")
    private CustomerType customerTypes;
    @OneToMany(mappedBy = "customer")
    private List<Contract> contract;

    public Customer() {
    }

    public Customer(Integer id, String name, String address, Date birthday, String email, Integer gender, String idCard, String phoneNumber, byte status, CustomerType customerTypes) {
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

    public CustomerType getCustomerTypes() {
        return customerTypes;
    }

    public void setCustomerTypes(CustomerType customerTypes) {
        this.customerTypes = customerTypes;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }
}
