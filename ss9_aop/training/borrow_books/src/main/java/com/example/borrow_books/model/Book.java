package com.example.borrow_books.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Book {
    @Id
    private Integer id;
    private String nameBook;
    private Integer amount;
    private byte status;
    @OneToMany(mappedBy = "bookList")
    private List<GhostBook> backBook;

    public Book() {
    }

    public Book(Integer id, String nameBook, Integer amount, byte status, List<GhostBook> backBook) {
        this.id = id;
        this.nameBook = nameBook;
        this.amount = amount;
        this.status = status;
        this.backBook = backBook;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public List<GhostBook> getBackBook() {
        return backBook;
    }

    public void setBackBook(List<GhostBook> backBook) {
        this.backBook = backBook;
    }
}
