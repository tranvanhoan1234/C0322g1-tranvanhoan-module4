package com.example.case_study.model.contract;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ContractDetail {
    @Id
    private Integer id;
    private Integer quantity;
    @ManyToOne
    @JoinColumn(name = "contract_id" ,referencedColumnName = "id")
    private Contract contract;
    @ManyToOne
    @JoinColumn(name = "contractDetails" ,referencedColumnName = "id")
    private AttachFacility attachFacility;
}
