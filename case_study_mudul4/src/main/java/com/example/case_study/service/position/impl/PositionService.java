package com.example.case_study.service.position.impl;

import com.example.case_study.model.employee.Position;
import com.example.case_study.repository.position.IPositionRepository;
import com.example.case_study.service.position.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService implements IPositionService {
    @Autowired
    IPositionRepository iPositionRepository;
    @Override
    public List<Position> findAll() {
        return iPositionRepository.findAll();
    }
}
