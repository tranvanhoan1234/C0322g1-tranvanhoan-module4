package com.example.form_waiting.controller;

import com.example.form_waiting.form_dto.FormDto;
import com.example.form_waiting.model.FormWaiting;
import com.example.form_waiting.service.IFormService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class FormWaitingController {
    @Autowired
    private IFormService iFormService;

    @GetMapping("")
    public String findAll(Model model){
        for (FormWaiting formWaiting: this.iFormService.findAll()) {
            System.out.println(formWaiting);
        }
        model.addAttribute("formList", this.iFormService.findAll());
        return "list";
    }
    @GetMapping("index")
    public String showList(Model model) {
        model.addAttribute("formWaitingDto", new FormDto());
        return "index";
    }
    @PostMapping("/waiting")
    public String create(@Validated @ModelAttribute FormDto formDto,
                         BindingResult bindingResult, RedirectAttributes redirectAttributes){
        new FormDto().validate(formDto, bindingResult);
        if (bindingResult.hasFieldErrors()){
            return "list";
        }
        FormWaiting formWaiting = new FormWaiting();
        BeanUtils.copyProperties(formDto, formWaiting);
        iFormService.save(formWaiting);
        redirectAttributes.addFlashAttribute("save","Add or Update Successfully!");
        return "redirect:/";
    }
}
