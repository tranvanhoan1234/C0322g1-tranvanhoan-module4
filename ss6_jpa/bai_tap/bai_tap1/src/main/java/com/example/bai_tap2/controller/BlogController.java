package com.example.bai_tap2.controller;

import com.example.bai_tap2.model.Blog;
import com.example.bai_tap2.service.IBlogSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

public class BlogController {
    @Autowired
    IBlogSevice iBlogSevice;

    @GetMapping("")
    public String findAll(Model model) {
        List<Blog> blogList = iBlogSevice.findAll();
        model.addAttribute("blogList", blogList);
        return "list";
    }

    //    @GetMapping("/search")
    //    public String search(@RequestParam String s, Model model) {
    //        model.addAttribute("product", iProductService.findByName(s));
    //        return "/index";
    //    }
//
    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("/create")
    public String save(@ModelAttribute Blog blog) {
        iBlogSevice.save(blog);
        return "redirect:/";
    }

    @GetMapping("/blog/{id}/edit")
    public String showEdit(@PathVariable Integer id, Model model) {
        Blog blog = iBlogSevice.findByIdd(id);
        model.addAttribute("blog", blog);
        return "/edit";
    }

    @PostMapping("/blog/edit")
    public String edit(@ModelAttribute Blog blog) {
        iBlogSevice.edit(blog);
        return "redirect:/";
    }

    @GetMapping("/blog/{id}/delete")
    public String delete(@PathVariable Integer id) {
        iBlogSevice.delete(id);
        return "redirect:/";
    }

    @GetMapping("/search")
    public String search(@RequestParam("name") String keyword, Model model) {
        List<Blog> blogList = iBlogSevice.findByName(keyword);
        model.addAttribute("blogList", blogList);
        return "list";
    }

    @GetMapping("/blog/{id}/view")
    public String view(@PathVariable Integer id) {
        iBlogSevice.findByIdd(id);
        return "redirect:/";
    }
}
