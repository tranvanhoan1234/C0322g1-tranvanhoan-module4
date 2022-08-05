package com.example.case_study.model.facility;

import com.example.case_study.model.contract.Contract;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nameFacility;
    private Integer area;
    private Double cost;
    private Integer maxPeople;
    private String sRoom;
    private Integer poolA;
    private String oAmenities;
    private Integer nFloOrs;
    private String facilityFree;
    @ManyToOne
    @JoinColumn(name = "rent_type_id", referencedColumnName = "id")
    private RentType rentType;
    @ManyToOne
    @JoinColumn(name = "facility_type_id", referencedColumnName = "id")
    private FacilityType facilityType;

    @OneToMany(mappedBy = "facility")
    @JsonBackReference
    private List<Contract> contracts;
    @Column(columnDefinition = "bit(1) default 0")
    private byte status;

    public Facility() {
    }

    public Facility(Integer id, String nameFacility, Integer area, Double cost, Integer maxPeople, String sRoom, Integer poolA, String oAmenities, Integer nFloOrs, String facilityFree, RentType rentType, FacilityType facilityType, List<Contract> contracts, byte status) {
        this.id = id;
        this.nameFacility = nameFacility;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.sRoom = sRoom;
        this.poolA = poolA;
        this.oAmenities = oAmenities;
        this.nFloOrs = nFloOrs;
        this.facilityFree = facilityFree;
        this.rentType = rentType;
        this.facilityType = facilityType;
        this.contracts = contracts;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameFacility() {
        return nameFacility;
    }

    public void setNameFacility(String nameFacility) {
        this.nameFacility = nameFacility;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(Integer maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getsRoom() {
        return sRoom;
    }

    public void setsRoom(String sRoom) {
        this.sRoom = sRoom;
    }

    public Integer getPoolA() {
        return poolA;
    }

    public void setPoolA(Integer poolA) {
        this.poolA = poolA;
    }

    public String getoAmenities() {
        return oAmenities;
    }

    public void setoAmenities(String oAmenities) {
        this.oAmenities = oAmenities;
    }

    public Integer getnFloOrs() {
        return nFloOrs;
    }

    public void setnFloOrs(Integer nFloOrs) {
        this.nFloOrs = nFloOrs;
    }

    public String getFacilityFree() {
        return facilityFree;
    }

    public void setFacilityFree(String facilityFree) {
        this.facilityFree = facilityFree;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public FacilityType getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(FacilityType facilityType) {
        this.facilityType = facilityType;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }
}