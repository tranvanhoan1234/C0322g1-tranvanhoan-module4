package com.example.service.impl;

import com.example.modle.Customer;
import com.example.repository.ICustomerRepositoy;
import com.example.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    ICustomerRepositoy iCustomerRepositoy;
    @Override
    public List<Customer> findAll() {
        return iCustomerRepositoy.findAll();
    }

    @Override
    public void save(Customer customer) {
        iCustomerRepositoy.save(customer);
    }

    @Override
    public Customer findById(int id) {
        return iCustomerRepositoy.findById(id);
    }

    @Override
    public void update(int id, Customer customer) {
        iCustomerRepositoy.update(id, customer);
    }

    @Override
    public void remove(int id) {
        iCustomerRepositoy.remove(id);
    }
}
