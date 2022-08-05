package com.example.case_study.repository;

import com.example.case_study.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ICustomerRepository extends JpaRepository<Customer, Integer> {
    @Query(value =
            "select * from customer where status=0 and `name` like :searchName"
           , nativeQuery = true,
            countQuery = "select count(*) from (select * from customer where `name` like :searchName) customer_type ")
    Page<Customer> findAll(@Param("searchName") String searchName, Pageable pageable);

    @Modifying
    @Query(value = "update customer set status = 1 where id = :id", nativeQuery = true)
    void deleteCustomer(@Param("id") Integer id);


    @Query(value = "select * from Customer where id = :id", nativeQuery = true)
    Customer findByIdd(@Param("id") Integer id);


}
