package com.example.controller;

import com.example.model.Declaration;
import com.example.service.IDeclarationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DeclarationController {
    @Autowired
    IDeclarationService iDeclarationService;

    @GetMapping("")
    public String display(Model model,Declaration declaration) {
        iDeclarationService.findAll(declaration);
        model.addAttribute("declaration", declaration);
        return "list";
    }

    @PostMapping("/index")
    public String create(@ModelAttribute Declaration declaration, Model model) {
        iDeclarationService.save(declaration);
        model.addAttribute("declaration", declaration);

//        redirectAttributes.addFlashAttribute("emailBox1", emailBox);
        return "list";

    }
}
