package com.example.model;

public class MedicalDeclarationForm {
    private String name;
    private String yearOfBirth;
    private String gender;
    private String nationality;
    private String identityCard;
    private String travelInformation;
    private String vehicleNumber;
    private String seats;
    private String departureDay;
    private String endDate;
    private String withinDays;

    public MedicalDeclarationForm() {
    }

    public MedicalDeclarationForm(String name, String yearOfBirth, String gender, String nationality, String identityCard, String travelInformation, String vehicleNumber, String seats, String departureDay, String endDate, String withinDays) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.nationality = nationality;
        this.identityCard = identityCard;
        this.travelInformation = travelInformation;
        this.vehicleNumber = vehicleNumber;
        this.seats = seats;
        this.departureDay = departureDay;
        this.endDate = endDate;
        this.withinDays = withinDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getTravelInformation() {
        return travelInformation;
    }

    public void setTravelInformation(String travelInformation) {
        this.travelInformation = travelInformation;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getDepartureDay() {
        return departureDay;
    }

    public void setDepartureDay(String departureDay) {
        this.departureDay = departureDay;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getWithinDays() {
        return withinDays;
    }

    public void setWithinDays(String withinDays) {
        this.withinDays = withinDays;
    }
}
