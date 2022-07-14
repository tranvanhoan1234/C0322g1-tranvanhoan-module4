package com.example.service.impl;

import com.example.service.ISandwichService;
import org.springframework.stereotype.Service;

@Service
public class SandwichService implements ISandwichService {
    @Override
    public String displaySandwich(String[] condiment) {
        String string = "";
        for (int i = 0; i < condiment.length; i++) {
            string += condiment[i] + "";
        }
        return string;
    }
}
