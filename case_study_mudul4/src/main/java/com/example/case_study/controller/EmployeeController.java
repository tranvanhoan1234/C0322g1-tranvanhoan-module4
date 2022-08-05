package com.example.case_study.controller;

import com.example.case_study.model.employee.Division;
import com.example.case_study.model.employee.EducationDegree;
import com.example.case_study.model.employee.Employee;
import com.example.case_study.model.employee.Position;
import com.example.case_study.service.IDivisionService;
import com.example.case_study.service.IEducationService;
import com.example.case_study.service.IEmployeeService;
import com.example.case_study.service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@Scope

public class EmployeeController {
    @Autowired
    IEmployeeService iEmployeeService;
    @Autowired
    IDivisionService iDivisionService;
    @Autowired
    IPositionService iPositionService;
    @Autowired
    IEducationService iEducationService;

    @ModelAttribute("division")
    public List<Division> findAllDivisionList() {
        return this.iDivisionService.findAll();
    }

    @ModelAttribute("position")
    public List<Position> findAllPosition() {
        return this.iPositionService.findAll();
    }

    @ModelAttribute("education")
    public List<EducationDegree> educationDegree() {
        return iEducationService.findAll();
    }


    @GetMapping("employee")
    public String goEmployee(
            Model model) {
        model.addAttribute("employee", iEmployeeService.findAll());
        model.addAttribute("employeeCreate", new Employee());
        return "/employee/list";
    }


    @PostMapping("/employee/create")
    public String save(@ModelAttribute Employee employee) {
        iEmployeeService.save(employee);
        return "redirect:/employee";
    }

    @GetMapping("/employee/delete/{id}")
    public String goDelete(@PathVariable Integer id) {
        iEmployeeService.delete(id);
        return "redirect:/employee";

    }
}
