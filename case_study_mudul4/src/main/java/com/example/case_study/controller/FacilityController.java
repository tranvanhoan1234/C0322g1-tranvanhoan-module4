package com.example.case_study.controller;

import com.example.case_study.model.facility.Facility;
import com.example.case_study.model.facility.FacilityType;
import com.example.case_study.model.facility.RentType;
import com.example.case_study.service.IFacilityService;
import com.example.case_study.service.IFacilityTypeService;
import com.example.case_study.service.IRentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@Scope
public class FacilityController {
    @Autowired
    private IFacilityService iFacilityService;
    @Autowired
    private IFacilityTypeService iFacilityTypeService;
    @Autowired
    private IRentTypeService iRentTypeService;

    @ModelAttribute("facilityTypeList")
    public List<FacilityType> getAllFacilityType() {
        return this.iFacilityTypeService.findAll();
    }

    @ModelAttribute("rentTypeList")
    public List<RentType> getAllRentType() {
        return this.iRentTypeService.findAll();
    }

    @GetMapping("/facility")
    public String goFacility(@PageableDefault(1) Pageable pageable, Optional<String> name, Model model) {
        String searchName = name.orElse("");
        Page<Facility> facilityPage = iFacilityService.findAll(searchName, pageable);
        model.addAttribute("facility", facilityPage);
        model.addAttribute("name", searchName);
        return "facility/list";
    }

    @GetMapping("facility/create")
    public String goCreate(Model model) {
        model.addAttribute("facility", new Facility());
        return "facility/create";
    }

    @PostMapping("/facility/create")
    public String goSave(@ModelAttribute Facility facility) {
        iFacilityService.save(facility);
        return "redirect:/facility";
    }

    @GetMapping("facility/delete/{id}")
    public String goDelete(@PathVariable Integer id) {
        iFacilityService.deleteFacility(id);
        return "redirect:/facility";
    }

    @GetMapping("facility/edit/{id}")
    public String showEdit(@PathVariable Integer id, Model model) {
        Optional<Facility> facility = iFacilityService.findById(id);
        model.addAttribute("facility", facility);
        return "facility/edit";
    }

    @PostMapping("facility/edit")
    public String edit(@ModelAttribute Facility facility) {
        iFacilityService.edit(facility);
        return "redirect:/facility";
    }
}

