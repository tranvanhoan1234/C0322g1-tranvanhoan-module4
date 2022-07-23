package com.example.bai_tap1.controller;

import com.example.bai_tap1.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.transaction.Transactional;

@Controller
@Transactional
public class CategoryController {
    @Autowired
    ICategoryService iCategoryService;
    @GetMapping("/listCategory")
    public String findAll(Model model , Pageable pageable){
        model.addAttribute("categoryList",iCategoryService.findAll(pageable));
        return "listCategory";
    }
}
