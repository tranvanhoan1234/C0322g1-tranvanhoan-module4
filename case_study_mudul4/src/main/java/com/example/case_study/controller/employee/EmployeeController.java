package com.example.case_study.controller.employee;

import com.example.case_study.service.division.IDivisionService;
import com.example.case_study.service.education.IEducationService;
import com.example.case_study.service.employee.IEmployeeService;
import com.example.case_study.service.position.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    IEmployeeService iEmployeeService;
    @Autowired
    IDivisionService iDivisionService;
    @Autowired
    IPositionService iPositionService;
    @Autowired
    IEducationService iEducationService;
    @GetMapping("")
    public String goEmployee(Model model) {
model.addAttribute("employee",iEmployeeService.findAll());
model.addAttribute("division",iDivisionService.findAll());
model.addAttribute("position",iPositionService.findAll());
model.addAttribute("education",iEducationService.findAll());
return "employee/list";
    }
}
