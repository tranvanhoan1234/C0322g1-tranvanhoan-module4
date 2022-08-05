package com.example.case_study.controller;

import com.example.case_study.model.contract.AttachFacility;
import com.example.case_study.model.contract.Contract;
import com.example.case_study.model.contract.ContractDetail;
import com.example.case_study.service.IAttachFacilityService;
import com.example.case_study.service.IContractDetailService;
import com.example.case_study.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("contract")
public class ContractController {
    @Autowired
    IContractService iContractService;
    @Autowired
    IContractDetailService iContractDetailService;
    @Autowired
    IAttachFacilityService iAttachFacilityService;

    @ModelAttribute("attach")
    public List<AttachFacility> attachFacilities() {
        return this.iAttachFacilityService.findAll();
    }

    @ModelAttribute("detail")
    public List<ContractDetail> contractDetails() {
        return this.iContractDetailService.findAll();
    }

    @GetMapping("")
    public String goFindContract(Model model) {
        List<Contract> contracts = iContractService.findAll();
        model.addAttribute("contract", contracts);
        return "contract/list";
    }
}
