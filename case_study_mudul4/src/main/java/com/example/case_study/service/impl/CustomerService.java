package com.example.case_study.service.impl;

import com.example.case_study.model.customer.Customer;
import com.example.case_study.repository.ICustomerRepository;
import com.example.case_study.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    ICustomerRepository iCustomerRepository;

    @Override
    public Page<Customer> findAll(String searchName,Pageable pageable) {
        return iCustomerRepository.findAll("%" + searchName + "%",pageable);
    }

    @Override
    public void save(Customer customer) {
        iCustomerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Integer id) {
        iCustomerRepository.deleteCustomer(id);
    }

    @Override
    public Customer findByIdd(Integer id) {
        return iCustomerRepository.findByIdd(id);
    }
    @Override
    public void edit(Customer customer ) {
        iCustomerRepository.save(customer);
    }


}
