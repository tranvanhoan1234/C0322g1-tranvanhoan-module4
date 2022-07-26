package com.example.controller;

import com.example.service.ICaculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculatorController {
    @Autowired
    ICaculatorService caculatorService;

    @GetMapping("")
    public String display() {
        return "index";
    }

    @PostMapping("")
    public String caculator(@RequestParam int one, @RequestParam int two, @RequestParam String calculation, Model model) {
        int result = caculatorService.funtionCaulator(one, two, calculation);
        model.addAttribute("result", result);
        return "index";

    }
}
