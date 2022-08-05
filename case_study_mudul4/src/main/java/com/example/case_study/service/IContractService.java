package com.example.case_study.service;

import com.example.case_study.model.contract.Contract;

import java.util.List;

public interface IContractService {
    List<Contract> findAll();
}
