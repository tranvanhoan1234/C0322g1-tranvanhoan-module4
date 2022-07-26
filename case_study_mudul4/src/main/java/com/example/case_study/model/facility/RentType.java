package com.example.case_study.model.facility;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RentType {
    @Id
    private Integer id;
    private String name;
}
