package com.example.cart.controller;

import com.example.cart.model.Cart;
import com.example.cart.model.Product;
import com.example.cart.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    IProductService iProductService;

    @ModelAttribute("cart")
    public Cart setupCart() {
        return new Cart();
    }

    @GetMapping("/shop")
    public ModelAndView showShop() {
        ModelAndView modelAndView = new ModelAndView("/shop");
        modelAndView.addObject("products", iProductService.findAll());
        return modelAndView;
    }

    //    Phương thương addToCart được sử dụng để thêm sản phẩm vào giỏ hàng trong đó action được s
//    ử dụng để chuyển hướng tới giao diện hiển thị tất cả các sản phẩm đang có trong giỏ hàng nếu
//    action = “show” và ngược lại sẽ hiển thị tất cả sản phẩm của shop.
    @GetMapping("/add/{id}")
    public String addToCart(@PathVariable Long id, @ModelAttribute Cart cart, @RequestParam("action") String action) {
        Optional<Product> productOptional = iProductService.findById(id);
        if (!productOptional.isPresent()) {
            return "/error.404";

        }
        if (action.equals("show")) {
            cart.addProduct(productOptional.get());
            return "redirect:/shopping/cart";
        }
        cart.addProduct(productOptional.get());
        return "redirect:/shop";
    }
}
