package com.example.product1.controller;

import com.example.product1.model.Product;
import com.example.product1.model.ProductDto;
import com.example.product1.service.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class ProductController {
    @Autowired
    IProductService iProductService;

    @GetMapping("")
    public String display(Model model, @PageableDefault(value = 2) Pageable pageable, Optional<String> name) {
        String search = name.orElse("");
        model.addAttribute("product", iProductService.findAll(pageable, search));
        return "list";
    }

    @GetMapping(value = "/create")
    public String createShow(Model model) {
        model.addAttribute("productDto", new ProductDto());
        return "create";
    }
    @PostMapping(value = "/create")
    public String saveCreate(@Valid @ModelAttribute ProductDto productDto,
                             BindingResult bindingResult) {
        new ProductDto().validate(productDto, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            return "create";
        }
        Product product = new Product();
        BeanUtils.copyProperties(productDto, product);
        iProductService.save(product);
        return "redirect:/";
    }
    
}
