package com.example.case_study.model.facility;

import javax.persistence.*;

@Entity
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nameFacility;
    private Integer area;
    private Double cost;
    private Integer maxPeople;
    private Integer sRoom;
    private Integer poolA;
    private Integer oAmenities;
    private Integer nFloOrs;
    private String facilityFree;
    @ManyToOne
    @JoinColumn(name = "rent_type_id",referencedColumnName = "id")
    private RentType rentType;
    @ManyToOne
    @JoinColumn(name = "facility_type_id",referencedColumnName = "id")
    private FacilityType facilityType;
    @Column(columnDefinition = "bit(1) default 0")
    private byte status;

    public Facility() {
    }

    public Facility(Integer id, String nameFacility, Integer area, Double cost, Integer maxPeople, Integer sRoom, Integer poolA, Integer oAmenities, Integer nFloOrs, String facilityFree, RentType rentType, FacilityType facilityType, byte status) {
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

    public Integer getsRoom() {
        return sRoom;
    }

    public void setsRoom(Integer sRoom) {
        this.sRoom = sRoom;
    }

    public Integer getPoolA() {
        return poolA;
    }

    public void setPoolA(Integer poolA) {
        this.poolA = poolA;
    }

    public Integer getoAmenities() {
        return oAmenities;
    }

    public void setoAmenities(Integer oAmenities) {
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

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }
}
