package com.example.controller;

import com.example.service.ICalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LuckController {
    @Autowired
    ICalculateService calculateService;

    @GetMapping("")
    public String display() {
        return "index";
    }

    @PostMapping("")
    public String calculate(@RequestParam(defaultValue = "0") int one, @RequestParam(defaultValue = "0") int tow, @RequestParam String calculation, Model model) {
        if (tow == 0) {
            model.addAttribute("alert", "The number" + one + "Not divide 0");
        } else {
            int total = calculateService.calculate(one, tow, calculation);
            model.addAttribute("one", one);
            model.addAttribute("tow", tow);
            model.addAttribute("total", total);

        }return "index";
    }
}
