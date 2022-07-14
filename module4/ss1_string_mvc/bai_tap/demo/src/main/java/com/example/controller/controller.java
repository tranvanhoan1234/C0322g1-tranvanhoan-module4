package com.example.controller;

import com.example.service.IConvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class controller {
    @Autowired
    IConvertService iConvertService;

    @GetMapping("")
    public String display() {
       return "index";
    }
    @PostMapping("")
    public String convert(Model model,int usd) {
        int vnd = iConvertService.convert(usd);
        model.addAttribute("usd", usd);
        model.addAttribute("vnd", vnd);
        return "index";
    }
}
