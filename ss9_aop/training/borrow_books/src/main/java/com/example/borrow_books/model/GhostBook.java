package com.example.borrow_books.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class GhostBook {
    @Id
    private Integer id;
    private Integer ghostBook;

    @ManyToOne
    @JoinColumn(name = "id_back_book", referencedColumnName = "id")
    private Book bookList;

    public GhostBook() {
    }

    public GhostBook(Integer id, Integer ghostBook, Book bookList) {
        this.id = id;
        this.ghostBook = ghostBook;

        this.bookList = bookList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGhostBook() {
        return ghostBook;
    }

    public void setGhostBook(Integer ghostBook) {
        this.ghostBook = ghostBook;
    }

    public Book getBookList() {
        return bookList;
    }

    public void setBookList(Book bookList) {
        this.bookList = bookList;
    }
}
