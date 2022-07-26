package com.example.borrow_books.controller;

import com.example.borrow_books.model.Book;
import com.example.borrow_books.service.IBookService;
import com.example.borrow_books.service.IGhostBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private IBookService iBookService;
    @Autowired
    private IGhostBookService iGhostBookService;
//    @ModelAttribute("bookList")
//    public List<>
    @GetMapping("")
    public String goBook(Model model) {
        model.addAttribute("ghostBookList", iGhostBookService.findAll());
        model.addAttribute("bookList", iBookService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String createBook(Model model) {
        model.addAttribute("bookList", new Book());
return "create";
    }
//    @PostMapping("/customer/create")
//    public String save(@ModelAttribute Customer customer) {
//        iCustomerService.save(customer);
//        return "redirect:/customer";
//    }
}
