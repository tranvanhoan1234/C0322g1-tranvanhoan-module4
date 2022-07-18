package com.example.model;

public class Declaration {
    private String name;
    private String yearOfBirth;
    private String travelNews;
    private String departureDay;
    private String endDate;
    private String in;

    public Declaration() {
    }

    public Declaration(String name, String yearOfBirth, String travelNews, String departureDay, String endDate, String in) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.travelNews = travelNews;
        this.departureDay = departureDay;
        this.endDate = endDate;
        this.in = in;
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

    public String getTravelNews() {
        return travelNews;
    }

    public void setTravelNews(String travelNews) {
        this.travelNews = travelNews;
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

    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
    }
}
