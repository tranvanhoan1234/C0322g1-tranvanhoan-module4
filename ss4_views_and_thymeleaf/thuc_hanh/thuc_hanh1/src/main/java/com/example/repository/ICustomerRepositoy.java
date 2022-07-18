package com.example.repository;

import com.example.modle.Customer;

import java.util.List;

public interface ICustomerRepositoy {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(int id);

    void update(int id, Customer customer);

    void remove(int id);
}
