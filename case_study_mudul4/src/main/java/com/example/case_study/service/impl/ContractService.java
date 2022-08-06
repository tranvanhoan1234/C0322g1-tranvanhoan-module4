package com.example.case_study.service.impl;

import com.example.case_study.model.contract.Contract;
import com.example.case_study.model.contract.ContractDetail;
import com.example.case_study.repository.IContractRepository;
import com.example.case_study.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ContractService implements IContractService {
    @Autowired
    IContractRepository iContractRepository;


    @Override
    public Page<Contract> findAll(String searchName, Pageable pageable) {
        return iContractRepository.findAllContract("%" + searchName + "%", pageable);
    }

}
