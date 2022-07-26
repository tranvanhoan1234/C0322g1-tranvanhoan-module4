package com.example.form_waiting.repository;

import com.example.form_waiting.model.FormWaiting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IFormRepository extends JpaRepository<FormWaiting,Integer>{
//    List<FormWaiting> findAll();

}
