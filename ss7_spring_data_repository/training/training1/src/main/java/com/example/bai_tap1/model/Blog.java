package com.example.bai_tap1.model;
import javax.persistence.*;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBlog;
    private String blogName;
    private String blogTitle;
    private boolean status;
    @ManyToOne
    @JoinColumn(name = "id_category", referencedColumnName = "idCategory")
    private Category category;

    public Blog() {
    }

    public Blog(Integer idBlog, String blogName, String blogTitle, boolean status, Category category) {
        this.idBlog = idBlog;
        this.blogName = blogName;
        this.blogTitle = blogTitle;
        this.status = status;
        this.category = category;
    }

    public Integer getIdBlog() {
        return idBlog;
    }

    public void setIdBlog(Integer idBlog) {
        this.idBlog = idBlog;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
