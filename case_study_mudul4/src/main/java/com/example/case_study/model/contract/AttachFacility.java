package com.example.case_study.model.contract;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class AttachFacility {
    @Id
    private Integer id;
    private String name;
    private Double cost;
    private String unit;
    private String status;
    @OneToMany(mappedBy = "attachFacility")
    private List<ContractDetail>contractDetails;
}
