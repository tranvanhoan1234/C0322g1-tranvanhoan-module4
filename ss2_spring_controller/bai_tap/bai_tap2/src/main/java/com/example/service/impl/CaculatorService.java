package com.example.service.impl;

import com.example.service.ICaculatorService;
import org.springframework.stereotype.Service;

@Service
public class CaculatorService implements ICaculatorService {
    @Override
    public int funtionCaulator(int one, int two, String calculation) {
        switch (calculation) {
            case "+":
                return one + two;
            case "-":
                return one - two;
            case "*":
                return one * two;
            case "/":
                return one / two;
        }
        return Integer.parseInt(calculation);
    }
}
