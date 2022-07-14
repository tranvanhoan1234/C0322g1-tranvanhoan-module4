package com.example.controller;

import com.example.service.ISearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {
    @Autowired
    ISearchService iSearchService;

    @GetMapping("")
    public String display() {
        return "index";
    }

    @PostMapping("")
    public String search(Model model, @RequestParam String search1) {
        String ketQua = iSearchService.search(search1);
        model.addAttribute("search", search1);
        model.addAttribute("ketQua", ketQua);
        return "index";
    }
}
