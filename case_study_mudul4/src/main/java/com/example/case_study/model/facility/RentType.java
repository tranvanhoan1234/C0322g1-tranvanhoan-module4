package com.example.case_study.model.facility;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class RentType {
    @Id
    private Integer id;
    private String nameRentType;
    @OneToMany(mappedBy = "rentType")
    @JsonBackReference
    private List<Facility> rentTypes;

    public RentType() {
    }

    public RentType(Integer id, String nameRentType, List<Facility> rentTypes) {
        this.id = id;
        this.nameRentType = nameRentType;
        this.rentTypes = rentTypes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameRentType() {
        return nameRentType;
    }

    public void setNameRentType(String nameRentType) {
        this.nameRentType = nameRentType;
    }

    public List<Facility> getRentTypes() {
        return rentTypes;
    }

    public void setRentTypes(List<Facility> rentTypes) {
        this.rentTypes = rentTypes;
    }
}
