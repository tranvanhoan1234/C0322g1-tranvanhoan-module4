package com.example.controller;

import com.example.model.PersonalMusicPlayerApp;
import com.example.service.IPersonaIMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class PresonalMusicController {
    @Autowired
    IPersonaIMusicService iPersonaIMusicService;
    @GetMapping("")
    public String display(Model model){
      List<PersonalMusicPlayerApp> p =iPersonaIMusicService.findAll();
        model.addAttribute("song",p);
        return "list";
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("song",new PersonalMusicPlayerApp());
        return "create";
    }
    @PostMapping("/song/create")
    public String save(@ModelAttribute PersonalMusicPlayerApp song) {
        iPersonaIMusicService.save(song);
        return "redirect:/";
    }

    @GetMapping("/song/{id}/edit")
    public String showEdit(@PathVariable Integer id, Model model){
        PersonalMusicPlayerApp song = iPersonaIMusicService.findById(id);
        model.addAttribute("song",song);
        return "/edit";
    }

    @PostMapping("/song/edit")
    public String edit(@ModelAttribute PersonalMusicPlayerApp song){
        iPersonaIMusicService.edit(song);
        return "redirect:/";
    }

    @GetMapping("/song/{id}/delete")
    public String delete(@PathVariable Integer id){
        iPersonaIMusicService.delete(id);
        return "redirect:/";
    }
}

