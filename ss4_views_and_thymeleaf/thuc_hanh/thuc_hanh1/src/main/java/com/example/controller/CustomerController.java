package com.example.controller;

import com.example.modle.Customer;
import com.example.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    ICustomerService iCustomerService;
    @GetMapping("")
    public String index(Model model) {

        List<Customer> customerList = iCustomerService.findAll();
        model.addAttribute("customers", customerList);
        return "index";
    }
}
