package com.example.case_study.repository;

import com.example.case_study.model.employee.EducationDegree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducationRepository extends JpaRepository<EducationDegree,Integer> {
}
