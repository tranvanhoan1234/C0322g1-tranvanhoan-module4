package com.example.case_study.service.facility.rent_type.impl;

import com.example.case_study.model.facility.RentType;
import com.example.case_study.repository.rent_type.IRentTypeRepository;
import com.example.case_study.service.facility.rent_type.IRentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentTypeService implements IRentTypeService {

    @Autowired
    IRentTypeRepository iRentTypeRepository;
    @Override
    public List<RentType> findAll() {
        return iRentTypeRepository.findAll();
    }
}
