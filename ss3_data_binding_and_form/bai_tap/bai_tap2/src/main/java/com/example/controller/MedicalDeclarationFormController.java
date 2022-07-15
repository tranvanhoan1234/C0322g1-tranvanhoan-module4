package com.example.controller;

import com.example.model.MedicalDeclarationForm;
import com.example.service.IMedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MedicalDeclarationFormController {
    @Autowired
    IMedicalService iMedicalService;

    @GetMapping("")
    public String display(Model model) {
        model.addAttribute("medical", new MedicalDeclarationForm());
        return "index";
    }

    @PostMapping("")
    public String createMedical(@ModelAttribute MedicalDeclarationForm medicalDeclarationForm) {
        iMedicalService.create(medicalDeclarationForm);
        return "index";
    }
}
//    public String caculator(@RequestParam int one, @RequestParam int two, @RequestParam String calculation, Model model) {
//        int result = caculatorService.funtionCaulator(one, two, calculation);
//        model.addAttribute("result", result);
//        return "index";