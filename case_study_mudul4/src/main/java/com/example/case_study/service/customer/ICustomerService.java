package com.example.case_study.service.customer;

import com.example.case_study.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService {
    Page<Customer> findAll(String searchName,Pageable pageable);

    void save(Customer customer);


    void deleteCustomer(Integer id);

    Customer findByIdd(Integer id);

    void edit(Customer customer);

}
