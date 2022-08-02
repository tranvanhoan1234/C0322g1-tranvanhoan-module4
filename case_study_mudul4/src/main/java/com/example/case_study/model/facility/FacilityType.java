package com.example.case_study.model.facility;

import com.fasterxml.jackson.annotation.JacksonAnnotation;
import com.fasterxml.jackson.annotation.JsonBackReference;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class FacilityType {
    @Id
    private Integer id;
    private String nameFacilityType;
    @OneToMany(mappedBy = "facilityType")
    @JsonBackReference
    private List<Facility> facilityList;

    public FacilityType() {
    }

    public FacilityType(Integer id, String nameFacilityType, List<Facility> facilityList) {
        this.id = id;
        this.nameFacilityType = nameFacilityType;
        this.facilityList = facilityList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameFacilityType() {
        return nameFacilityType;
    }

    public void setNameFacilityType(String nameFacilityType) {
        this.nameFacilityType = nameFacilityType;
    }

    public List<Facility> getFacilityList() {
        return facilityList;
    }

    public void setFacilityList(List<Facility> facilityList) {
        this.facilityList = facilityList;
    }
}
