package com.example.practice1.controller;

import com.example.practice1.model.SmartPhone;
import com.example.practice1.service.ISmartphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@RestController
@RequestMapping("/smartPhones/api/v1")
@CrossOrigin
public class SmartHomeController {
    @Autowired
    ISmartphoneService iSmartphoneService;

    @GetMapping
    public ResponseEntity<Iterable<SmartPhone>> allPhones() {
        return new ResponseEntity<>(iSmartphoneService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<SmartPhone> createSmart(@RequestBody SmartPhone smartPhone) {
        return new ResponseEntity<>(iSmartphoneService.save(smartPhone), HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ModelAndView getAll() {
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("smartPhones", iSmartphoneService.findAll());
        return modelAndView;
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<SmartPhone> deleteSmartPhone(@PathVariable Long id) {
        Optional<SmartPhone> smartPhoneOptional = iSmartphoneService.findById(id);
        if (!smartPhoneOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        iSmartphoneService.remove(id);
        return new ResponseEntity<>(smartPhoneOptional.get(), HttpStatus.NO_CONTENT);
    }

    @GetMapping("/edit/{id}")
    public ResponseEntity<Optional<SmartPhone>> getPhone(@PathVariable Long id) {
        Optional<SmartPhone> smartphoneOptional = iSmartphoneService.findById(id);
        if (!smartphoneOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(smartphoneOptional, HttpStatus.OK);
    }

    @PostMapping("/edit")
    public ResponseEntity<Iterable<SmartPhone>> updateSmartphone(@RequestBody SmartPhone smartphone) {
        iSmartphoneService.save(smartphone);
        return new ResponseEntity<>(iSmartphoneService.findAll(), HttpStatus.NO_CONTENT);
    }

}
