package com.example.bai_tap1.model;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@Entity
@Transactional
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCategory;
    private String nameCategory;
    private byte status;
    @OneToMany(mappedBy = "category")
    private List<Blog> blog;

    public Category() {
    }

    public Category(Integer idCategory, String nameCategory, byte status, List<Blog> blog) {
        this.idCategory = idCategory;
        this.nameCategory = nameCategory;
        this.status = status;
        this.blog = blog;
    }

    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public List<Blog> getBlog() {
        return blog;
    }

    public void setBlog(List<Blog> blog) {
        this.blog = blog;
    }
}
