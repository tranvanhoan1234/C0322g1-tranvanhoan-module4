package com.example.borrow_books.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String author;

    private Integer quantity;

    @OneToMany(mappedBy = "book")
    private List<DetailBook> detailBook;

    public Book() {
    }

    public Book(Integer id, String name, String author, Integer quantity, List<DetailBook> detailBook) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
        this.detailBook = detailBook;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public List<DetailBook> getDetailBook() {
        return detailBook;
    }

    public void setDetailBook(List<DetailBook> detailBook) {
        this.detailBook = detailBook;
    }
}
