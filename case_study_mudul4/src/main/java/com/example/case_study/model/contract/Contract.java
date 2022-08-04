package com.example.case_study.model.contract;

import com.example.case_study.model.customer.Customer;
import com.example.case_study.model.employee.Employee;
import com.example.case_study.model.facility.Facility;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date starDate;
    private Date endDate;
    private Double deposit;
    @ManyToOne
    private Employee employee;
    @ManyToOne
    @JoinColumn(name = "customer_id" ,referencedColumnName = "id")
    private Customer customer;
    @ManyToOne
    private Facility facility;
    @OneToMany(mappedBy = "contract")
    private List<ContractDetail> contractDetails;

}
