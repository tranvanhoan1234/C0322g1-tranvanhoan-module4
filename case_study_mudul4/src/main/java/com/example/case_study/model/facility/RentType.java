package com.example.case_study.model.facility;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class RentType {
    @Id
    private Integer id;
    private String name;
    @OneToMany(mappedBy = "rentType")
    private List<Facility>rentTypes;

    public RentType() {
    }

    public RentType(Integer id, String name, List<Facility> rentTypes) {
        this.id = id;
        this.name = name;
        this.rentTypes = rentTypes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Facility> getRentTypes() {
        return rentTypes;
    }

    public void setRentTypes(List<Facility> rentTypes) {
        this.rentTypes = rentTypes;
    }
}
