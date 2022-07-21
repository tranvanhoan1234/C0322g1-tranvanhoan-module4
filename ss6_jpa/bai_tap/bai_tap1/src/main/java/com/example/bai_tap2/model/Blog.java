package com.example.bai_tap2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Blog {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String blogName;
    private String blogTitle;
    private boolean status;


    public Blog() {
    }

    public Blog(Integer id, String blogName, String blogTitle, boolean status) {
        this.id = id;
        this.blogName = blogName;
        this.blogTitle = blogTitle;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
