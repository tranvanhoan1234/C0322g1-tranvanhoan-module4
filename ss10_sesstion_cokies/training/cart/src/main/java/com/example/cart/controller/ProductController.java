package com.example.cart.controller;

import com.example.cart.model.Cart;
import com.example.cart.model.Product;
import com.example.cart.model.ProductDto;
import com.example.cart.service.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
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
        Product productDto1 = new Product();
        BeanUtils.copyProperties(productDto, productDto1);
        iProductService.save(productDto1);
        return "redirect:/shop";
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
        Optional<Product>productDtoOptional=iProductService.findById(id);
        if (!productDtoOptional.isPresent()) {
            return "/error.404";

        }
        if (action.equals("show")) {
            cart.addProduct(productDtoOptional.get());
            return "redirect:/shopping/cart";
        }
        cart.addProduct(productDtoOptional.get());
        return "redirect:/shop";
    }
}
