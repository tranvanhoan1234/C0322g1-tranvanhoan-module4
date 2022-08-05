package com.example.case_study.service.impl;

import com.example.case_study.model.contract.Contract;
import com.example.case_study.repository.IContractRepository;
import com.example.case_study.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ContractService implements IContractService {
    @Autowired
    IContractRepository iContractRepository;
    @Override
    public List<Contract> findAll() {
return iContractRepository.findAll();
    }
}
