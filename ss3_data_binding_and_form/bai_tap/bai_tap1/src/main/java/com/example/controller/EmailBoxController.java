package com.example.controller;

import com.example.model.EmailBox;
import com.example.service.IEmailBoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmailBoxController {
    @Autowired
    IEmailBoxService iEmailBoxService;

    @GetMapping("")
    public String showCreateEmailBox(Model model) {

        model.addAttribute("EmailBox", new EmailBox());

        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute EmailBox emailBox, Model model) {
        iEmailBoxService.save(emailBox);
        model.addAttribute("emailBox",emailBox);

//        redirectAttributes.addFlashAttribute("emailBox1", emailBox);
        return "list";

    }
}
