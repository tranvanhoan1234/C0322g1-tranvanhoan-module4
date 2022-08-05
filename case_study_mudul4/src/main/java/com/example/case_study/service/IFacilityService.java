package com.example.case_study.service;

import com.example.case_study.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IFacilityService {

    void save(Facility facility);

    void deleteFacility(Integer id);

    Optional<Facility> findById(Integer id);

    void edit(Facility facility);

    Page<Facility> findAll(String searchName, Pageable pageable);

}
