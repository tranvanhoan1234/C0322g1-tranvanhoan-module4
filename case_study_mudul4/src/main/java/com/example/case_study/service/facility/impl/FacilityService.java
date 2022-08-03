package com.example.case_study.service.facility.impl;

import com.example.case_study.model.facility.Facility;
import com.example.case_study.repository.facility.IFacilityRepository;
import com.example.case_study.service.facility.IFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FacilityService implements IFacilityService {
    @Autowired
    IFacilityRepository iFacilityRepository;
    @Override
    public void save(Facility facility) {
        iFacilityRepository.save(facility);
    }

    @Override
    public void deleteFacility(Integer id) {
        iFacilityRepository.deleteFacility(id);
    }

    @Override
    public Optional<Facility> findById(Integer id) {
        return iFacilityRepository.findById(id);
    }

    @Override
    public void edit(Facility facility) {
        iFacilityRepository.save(facility);
    }

    @Override
    public Page<Facility> findAll(String searchName, Pageable pageable) {

        return iFacilityRepository.findAllFacility("%"+searchName+"%",pageable);
    }

}
