package com.example.bai_tap1.controller;

import com.example.bai_tap1.model.Blog;
import com.example.bai_tap1.service.IBlogService;
import com.example.bai_tap1.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.transaction.Transactional;
import java.util.Optional;

@Controller
@Transactional
public class BlogController {
    @Autowired
    IBlogService iBlogService;
    @Autowired
    ICategoryService iCategoryService;

    @GetMapping("")
    public String findAllBlog(Model model, @PageableDefault(value = 2) Pageable pageable, Optional<String> searchName) {
       String search = searchName.orElse("");
        model.addAttribute("blogList", iBlogService.findAll(pageable,search));
        return "list";
    }

    @GetMapping("create")
    public String showCreate(Model model) {
        model.addAttribute("blogList", new Blog());
        model.addAttribute("categoryList", iCategoryService.findCategory());
        return "create";
    }

    @PostMapping("/create")
    public String createBlog(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        iBlogService.save(blog);
        redirectAttributes.addFlashAttribute("msg", "create blog" + blog.getBlogName() + "ok");
        return "redirect:/";
    }
    @GetMapping("/delete")
    public String delete( Integer id){
     iBlogService.deleteById(id);
        return "redirect:/";
    }
}
