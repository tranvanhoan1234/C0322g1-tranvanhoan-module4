package com.example.borrow_books.repository;

import com.example.borrow_books.model.Traffic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITrafficRepository extends JpaRepository<Traffic,Integer> {
}
