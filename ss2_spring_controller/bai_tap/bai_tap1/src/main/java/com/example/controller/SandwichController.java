package com.example.controller;

import com.example.service.ISandwichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {
    @Autowired
    ISandwichService iSandwichService;
    @GetMapping("")
    public String display(){
        return ("index");
    }
    @PostMapping("/sandwich")
    public String sandwich(@RequestParam (value = "condiment") String[] condiment, Model model){
        String sandwich=iSandwichService.displaySandwich(condiment);
        model.addAttribute("s",sandwich);
        return "index";

    }
}
