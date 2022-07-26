package com.example.borrow_books.repository;

import com.example.borrow_books.model.GhostBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGhostRepository extends JpaRepository<GhostBook, Integer> {
}
