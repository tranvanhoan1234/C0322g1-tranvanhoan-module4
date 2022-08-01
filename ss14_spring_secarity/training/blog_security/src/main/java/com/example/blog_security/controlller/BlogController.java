package com.example.blog_security.controlller;

import com.example.blog_security.model.Blog;
import com.example.blog_security.service.IBlogService;
import com.example.blog_security.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BlogController {
    @Autowired
    private IBlogService iBlogService;
    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping("")
    public String findAll(Model model) {

        model.addAttribute("blogList", iBlogService.findAll());
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
        redirectAttributes.addFlashAttribute("msg", "create blog" + blog.getName() + "ok");
        return "redirect:/";
    }
    @GetMapping("/delete")
    public String delete(Integer id){
iBlogService.delete(id);
return "redirect:/";
    }
}
