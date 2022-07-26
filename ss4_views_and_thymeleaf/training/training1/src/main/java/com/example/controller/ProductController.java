package com.example.controller;

import com.example.model.Product;
import com.example.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller

public class ProductController {
    @Autowired
    IProductService iProductService;

    @GetMapping("")
    public String display(Model model) {
        List<Product> productList = iProductService.findAll();
        model.addAttribute("product", productList);
        return "/index";
    }

    @GetMapping("/search")
    public String search(@RequestParam String s, Model model) {
        List<Product> productList1 = iProductService.search(s);
        model.addAttribute("product", productList1);
        return "/index";
    }

    @GetMapping("/create")
    public String createProduct(Model model) {
        model.addAttribute("products", new Product());
        return "/create";
    }

    @GetMapping("{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("product", iProductService.findById(id));
        return "/edit";

    }

    @PostMapping("/save")
    public String save(Product product) {
        product.setId(0);
        iProductService.save(product);
        return "redirect:/";
    }

    @PostMapping("/edit")
    public String update(@ModelAttribute Product product) {
        iProductService.update(product);
        return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("product", iProductService.findById(id));
        return "delete";
    }

    @PostMapping("delete")
    public String delete(Product customer, RedirectAttributes redirect) {
        iProductService.remove(customer.getId());
        redirect.addFlashAttribute("product", "Removed product successfully!");
        return "redirect:/";
    }
}
