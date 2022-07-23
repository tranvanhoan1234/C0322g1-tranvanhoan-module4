package com.example.controller;

import com.example.model.Product;
import com.example.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {
        @Autowired
        IProductService iProductService;
        @GetMapping("")
        public String display(Model model){
            List<Product> p =iProductService.findAll();
            model.addAttribute("product",p);
            return "list";
        }

        @GetMapping("/create")
        public String create(Model model){
            model.addAttribute("product",new Product());
            return "create";
        }
        @PostMapping("/product/create")
        public String save(@ModelAttribute Product product) {
            iProductService.save(product);
            return "redirect:/";
        }
        @GetMapping("/product/{id}/edit")
        public String showEdit(@PathVariable Integer id, Model model){
            Product product = iProductService.findById(id);
            model.addAttribute("product",product);
            return "/edit";
        }

        @PostMapping("/product/edit")
        public String edit(@ModelAttribute Product song){
            iProductService.edit(song);
            return "redirect:/";
        }
        @GetMapping("/product/{id}/delete")
        public String delete(@PathVariable Integer id){
            iProductService.delete(id);
            return "redirect:/";
        }

}
