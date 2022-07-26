package com.example.borrow.controller;

import com.example.borrow.model.Book;
import com.example.borrow.model.DetailBook;
import com.example.borrow.service.IBookService;
import com.example.borrow.service.IDeTaiBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class BookController {
    @Autowired
    IBookService iBookService;
    @Autowired
    IDeTaiBookService iDeTaiBookService;

    @GetMapping("")
    public String goBook(Model model) {
        List<Book> bookList = iBookService.findAll();
        model.addAttribute("bookList", bookList);
        return "list";
    }

    @GetMapping("/create")
    public String goCreate(Model model) {
        model.addAttribute("book", new Book());
        return "/create";
    }

    @PostMapping("/book/create")
    public String comeBackCreate(@ModelAttribute("book") Book book, Model model) {
        iBookService.save(book);
        return "redirect:/";
    }


    @GetMapping("/show/detail")
    public String showDetail(@RequestParam Optional<Integer> id, Model model) {
        if (id.isPresent()) {
            this.iBookService.borrowBook(id.get());
        }
        List<DetailBook> detailBooks = this.iDeTaiBookService.findAll();
        model.addAttribute("detailBooks", detailBooks);
        return "borrow";
    }

    @GetMapping("/borrow")
    public String borrowBook(@RequestParam Integer id, Model model) {
        this.iBookService.setQuantity(id);
        this.iBookService.setStatus(id);
        return "redirect:/show/detail";
    }
//
//    @GetMapping("/return")
//    public String returnBook(@RequestParam Integer bookCode) throws Exception {
//        this.detailBookService.returnBook(bookCode);
//        return "redirect:/";
}

