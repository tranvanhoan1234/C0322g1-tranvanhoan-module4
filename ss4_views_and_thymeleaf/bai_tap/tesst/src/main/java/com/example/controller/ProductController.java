package com.example.controller;

import com.example.modle.Product;
import com.example.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    IProductService iProductService;

    @GetMapping("")
    public String index(Model model) {
        List<Product> productList = iProductService.findAll();
        model.addAttribute("product", productList);
        return "index";
    }

    @GetMapping("/search")
    public String search(@RequestParam String s, Model model) {
        model.addAttribute("product", iProductService.findByName(s));
        return "/index";
    }

    @GetMapping("/deletee")
    public String delete(@RequestParam int id) {
        System.out.println(id);
        iProductService.delete(id);
        return "redirect:/";
    }

}
