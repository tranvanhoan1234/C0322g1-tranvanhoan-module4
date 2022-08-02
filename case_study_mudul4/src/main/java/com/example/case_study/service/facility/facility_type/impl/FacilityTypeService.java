package com.example.case_study.service.facility.facility_type.impl;

import com.example.case_study.model.facility.FacilityType;
import com.example.case_study.repository.facility.IFacilityRepository;
import com.example.case_study.repository.facility_type.IFacilityTypeRepository;
import com.example.case_study.service.facility.facility_type.IFacilityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityTypeService implements IFacilityTypeService {
    @Autowired
    IFacilityTypeRepository iFacilityTypeRepository;
    @Override
    public List<FacilityType> findAll() {
        return iFacilityTypeRepository.findAll();
    }
}
