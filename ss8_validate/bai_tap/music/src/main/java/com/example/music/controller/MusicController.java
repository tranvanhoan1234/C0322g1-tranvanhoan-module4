package com.example.music.controller;

import com.example.music.model.Music;
import com.example.music.model.MusicDto;
import com.example.music.service.IMusicService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class MusicController {
    @Autowired
    IMusicService iMusicService;

    @GetMapping("home")
    public String display(Model model) {
        model.addAttribute("song", iMusicService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("song", new MusicDto());
        return "create";
    }

    @PostMapping("/song/create")
    public String save(@Valid @ModelAttribute("song") MusicDto musicDto, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        new MusicDto().validate(musicDto, bindingResult);
        if (bindingResult.hasErrors()) {
            return "create";
        }
        Music music = new Music();
        System.out.println("aaaa");
        BeanUtils.copyProperties(musicDto, music);
        iMusicService.save(music);
        redirectAttributes.addFlashAttribute("save", "add them mowis");
        return "redirect:/home";
    }

//    @GetMapping("/song/{id}/edit")
//    public String showEdit(@PathVariable Integer id, Model model){
//        PersonalMusicPlayerApp song = iPersonaIMusicService.findById(id);
//        model.addAttribute("song",song);
//        return "/edit";
//    }
//
//    @PostMapping("/song/edit")
//    public String edit(@ModelAttribute PersonalMusicPlayerApp song){
//        iPersonaIMusicService.edit(song);
//        return "redirect:/";
//    }
//
//    @GetMapping("/song/{id}/delete")
//    public String delete(@PathVariable Integer id){
//        iPersonaIMusicService.delete(id);
//        return "redirect:/";
//    }
}
