package com.example.controller;

import com.example.modle.Login;
import com.example.modle.User;
import com.example.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @GetMapping("")
    public ModelAndView home(){
        ModelAndView modelAndView =new ModelAndView("index","login",new Login());
        return modelAndView;
    }
    @Autowired
    IUserRepository iUserRepository;
    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute("login") Login login){
        User user = IUserRepository.checkLogin(login);
        if(user == null){
            ModelAndView modelAndView = new ModelAndView("error");
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("user");
            modelAndView.addObject("user", user);
            return modelAndView;
        }
    }
}
