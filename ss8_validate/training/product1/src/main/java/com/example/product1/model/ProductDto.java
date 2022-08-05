package com.example.product1.model;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class ProductDto implements Validator {
    private Integer id;
    @NotBlank(message = "not name blank")
    @Pattern(regexp = "^\\w{5,45}$", message = "tối đã 6 >45 kí tưej")

    private String name;
    @NotBlank(message = "not price blank")
    @Pattern(regexp = "^0\\d{9}$", message = "10 so")
    private String price;
    @NotBlank(message = "not description blank")
    private String description;
    @NotBlank(message = "not manufacturer blank")
    private String manufacturer;

    public ProductDto() {
    }

    public ProductDto(Integer id, String name, String price, String description, String manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.manufacturer = manufacturer;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {


    }
}
