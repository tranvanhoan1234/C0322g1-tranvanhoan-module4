package com.example.case_study.repository.customer_type;

import com.example.case_study.model.customer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ICustomerTypeRepository extends JpaRepository<CustomerType,Integer> {
}
