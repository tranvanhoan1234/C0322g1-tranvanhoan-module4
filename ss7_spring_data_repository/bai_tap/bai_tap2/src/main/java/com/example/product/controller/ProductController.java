package com.example.product.controller;

import com.example.product.model.Product;
import com.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.transaction.Transactional;
import java.util.Optional;

@Controller
@Transactional
public class ProductController {
    @Autowired
    ProductService iProductService;

    @GetMapping("")
    public String display(Model model, @PageableDefault(value = 2) Pageable pageable, Optional<String> name) {
        String search = name.orElse("");
        model.addAttribute("product", iProductService.findAll(pageable, search));
        return "list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "create";
    }

    @PostMapping("/product/create")
    public String save(@ModelAttribute Product product) {
        iProductService.save(product);
        return "redirect:/";
    }
//    @GetMapping("/product/{id}/edit")
//    public String showEdit(@PathVariable Integer id, Model model){
//        Product product = iProductService.findById(id);
//        model.addAttribute("product",product);
//        return "/edit";
//    }
//
//    @PostMapping("/product/edit")
//    public String edit(@ModelAttribute Product song){
//        iProductService.edit(song);
//        return "redirect:/";
//    }
//    @GetMapping("/product/{id}/delete")
//    public String delete(@PathVariable Integer id){
//        iProductService.delete(id);
//        return "redirect:/";
//    }
}
