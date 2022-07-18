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
    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("medicineCreate", new MedicalDeclarationForm());
        return "create";
    }

    @PostMapping("/create")
    public String showForm(@ModelAttribute MedicalDeclarationForm medicineClare) {
        iMedicalService.save(medicineClare);
        return "redirect:/";
    }

    @GetMapping("/edit")
    public String findId(@RequestParam("id") Integer id, Model model) {
        model.addAttribute("medicine", iMedicalService.findById(id));
        return "/edit";
    }

    @PostMapping("/edit")
    public String save(@ModelAttribute MedicalDeclarationForm medicineClare, Model model) {
        iMedicalService.update(medicineClare);
        return "redirect:/";
    }
}
//    public String caculator(@RequestParam int one, @RequestParam int two, @RequestParam String calculation, Model model) {
//        int result = caculatorService.funtionCaulator(one, two, calculation);
//        model.addAttribute("result", result);
//        return "index";