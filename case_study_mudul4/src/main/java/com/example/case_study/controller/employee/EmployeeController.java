package com.example.case_study.controller.employee;

import com.example.case_study.model.employee.Division;
import com.example.case_study.model.employee.EducationDegree;
import com.example.case_study.model.employee.Employee;
import com.example.case_study.model.employee.Position;
import com.example.case_study.service.division.IDivisionService;
import com.example.case_study.service.education.IEducationService;
import com.example.case_study.service.employee.IEmployeeService;
import com.example.case_study.service.position.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
