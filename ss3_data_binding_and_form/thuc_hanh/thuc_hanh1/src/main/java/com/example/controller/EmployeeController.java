package com.example.controller;

import com.example.modle.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("employee")
public class EmployeeController {
    @RequestMapping(value = "showForm", method = RequestMethod.GET)
    public String showFrom(ModelMap modelMap) {
        modelMap.addAttribute("employee", new Employee());
        return "index";
    }

    //    @Autowired
//    IEmployeeService employeeService;
    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public String submit(@ModelAttribute("employee") Employee employee, ModelMap modelMap) {
        modelMap.addAttribute("id", employee.getId());
        modelMap.addAttribute("name", employee.getName());
        modelMap.addAttribute("contactName", employee.getContactName());
        return "info";

    }
}
