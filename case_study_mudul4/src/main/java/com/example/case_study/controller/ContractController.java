package com.example.case_study.controller;

import com.example.case_study.model.contract.AttachFacility;
import com.example.case_study.model.contract.Contract;
import com.example.case_study.model.contract.ContractDetail;
import com.example.case_study.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    IContractService iContractService;
    @Autowired
    IContractDetailService iContractDetailService;
    @Autowired
    IAttachFacilityService iAttachFacilityService;
    @Autowired
    ICustomerService iCustomerService;
    @Autowired
    IEmployeeService iEmployeeService;
    @Autowired
    IFacilityService iFacilityService;

    @ModelAttribute("attach")
    public List<AttachFacility> attachFacilities() {
        return this.iAttachFacilityService.findAll();
    }

    @ModelAttribute("detail")
    public List<ContractDetail> contractDetails() {
        return this.iContractDetailService.findAll();
    }

    @GetMapping("")
    public String goFindContract(@PageableDefault(3) Pageable pageable,Optional<String> name, Model model) {
        String searchName=name.orElse("");
        Page<Contract> contracts = iContractService.findAll(searchName,pageable);
        model.addAttribute("contract", contracts);
        model.addAttribute("name",searchName);
        return "contract/list";
    }

}
