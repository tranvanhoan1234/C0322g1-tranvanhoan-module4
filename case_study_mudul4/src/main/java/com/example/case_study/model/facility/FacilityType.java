package com.example.case_study.model.facility;

import org.w3c.dom.stylesheets.LinkStyle;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class FacilityType {
    @Id
    private Integer id;
    private String name;
}
