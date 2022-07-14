package com.example.controller;
import com.example.service.IConvertCurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertCurrencyController {

    @Autowired
    IConvertCurrencyService convertCurrencyService;


    @GetMapping("")
    public String display() {
       return "/index";
    }

        @PostMapping("")
        public String convert(Model model, int usd1){
            int vnd = convertCurrencyService.convert(usd1);
            model.addAttribute("usd",usd1);
            model.addAttribute("vnd",vnd);
            return "/index";
}
}
