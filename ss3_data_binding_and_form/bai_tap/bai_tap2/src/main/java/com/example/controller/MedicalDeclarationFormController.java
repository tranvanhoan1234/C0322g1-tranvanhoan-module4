package com.example.controller;

import com.example.model.MedicalDeclarationForm;
import com.example.service.IMedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MedicalDeclarationFormController {
    @Autowired
    IMedicalService iMedicalService;

    @GetMapping("")
    public String display() {
        ModelAndView modelAttribute = new ModelAndView("viTri", "toKhai", new MedicalDeclarationForm());
        String[] gender = iMedicalService.getGender();
        modelAttribute.addObject("gender", gender);
        return String.valueOf(modelAttribute);
    }
@PostMapping
    public String create(@ModelAttribute MedicalDeclarationForm medicalDeclarationForm, Model model) {
        iMedicalService.save(medicalDeclarationForm);
        model.addAttribute("medicalDeclarationForm", medicalDeclarationForm);
        return "list";

    }
}
//    public String caculator(@RequestParam int one, @RequestParam int two, @RequestParam String calculation, Model model) {
//        int result = caculatorService.funtionCaulator(one, two, calculation);
//        model.addAttribute("result", result);
//        return "index";