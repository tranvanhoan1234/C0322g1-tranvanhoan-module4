package com.example.borrow_books.controller;
import com.example.borrow_books.model.Book;
import com.example.borrow_books.model.DetailBook;
import com.example.borrow_books.service.IBookService;
import com.example.borrow_books.service.IDetailBookService;
import com.example.borrow_books.service.ITrafficService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
public class BookController {
    @Autowired
    private IBookService bookService;

    @Autowired
    private IDetailBookService detailBookService;

    @Autowired
    private ITrafficService trafficService;

    @GetMapping("")
    public String goHome(Model model){
        List<Book> bookList = this.bookService.findAll();
        model.addAttribute("books", bookList);
        int view = this.trafficService.getById();
        model.addAttribute("view", view);
        return "home";
    }

    @GetMapping("/create")
    public String goCreate(Model model){
        model.addAttribute("book", new Book());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("book") Book book, Model model){
        this.bookService.save(book);
        return "redirect:/";
    }

    @GetMapping("/show-detail")
    public String showDetail(@RequestParam Optional<Integer> id, Model model){
        if (id.isPresent()) {
            this.bookService.borrowBook(id.get());
        }
        List<DetailBook> detailBooks = this.detailBookService.findAll();
        model.addAttribute("detailBooks", detailBooks);
        return "/borrow";
    }

    @GetMapping("/borrow")
    public String borrowBook(@RequestParam Integer id, Model model){
        this.bookService.setQuantity(id);
        this.detailBookService.setStatus(id);
        return "redirect:/show-detail";
    }
    @GetMapping("/return")
    public String returnBook(@RequestParam Integer bookCode) throws Exception {
        this.detailBookService.returnBook(bookCode);
        return "redirect:/";
    }

}