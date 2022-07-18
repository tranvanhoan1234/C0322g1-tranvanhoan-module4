package com.example.service.impl;

import com.example.service.ICalculateService;
import org.springframework.stereotype.Service;

@Service
public class CalculateService implements ICalculateService {
    @Override
    public int calculate(int one, int tow, String calculation) {


            int total = 0;
            switch (calculation) {
                case "+":
                    total = one + tow;
                    break;
                case "-":
                    total = one - tow;
                    break;
                case "*":
                    total = one * tow;
                    break;
                case "/":

                    total = one / tow;
                    break;
            }
            return total;
    }

}
