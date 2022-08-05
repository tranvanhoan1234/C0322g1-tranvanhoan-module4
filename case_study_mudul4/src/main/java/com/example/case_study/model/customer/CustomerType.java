package com.example.case_study.model.customer;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nameType;
    @OneToMany(mappedBy = "customerTypes")
    @JsonBackReference
    private List<Customer> customers;

    public CustomerType() {
    }

    public CustomerType(Integer id) {
        this.id = id;
    }

    public CustomerType(Integer id, String nameType, List<Customer> customers) {
        this.id = id;
        this.nameType = nameType;
        this.customers = customers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
