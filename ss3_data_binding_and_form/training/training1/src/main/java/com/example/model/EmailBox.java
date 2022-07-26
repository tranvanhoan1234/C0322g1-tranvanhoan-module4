package com.example.model;

public class EmailBox {
    private String lenguages;
    private Integer pageSize;
    private String SpamsFilter;
    private String Signature;

    public EmailBox() {
    }

    public EmailBox(String lenguages, Integer pageSize, String spamsFilter, String signature) {
        this.lenguages = lenguages;
        this.pageSize = pageSize;
        SpamsFilter = spamsFilter;
        Signature = signature;
    }

    public String getLenguages() {
        return lenguages;
    }

    public void setLenguages(String lenguages) {
        this.lenguages = lenguages;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getSpamsFilter() {
        return SpamsFilter;
    }

    public void setSpamsFilter(String spamsFilter) {
        SpamsFilter = spamsFilter;
    }

    public String getSignature() {
        return Signature;
    }

    public void setSignature(String signature) {
        Signature = signature;
    }
}
