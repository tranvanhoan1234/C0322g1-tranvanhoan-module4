package com.example.service.impl;

import com.example.service.ICaculatorService;
import org.springframework.stereotype.Service;

@Service
public class CaculatorService implements ICaculatorService {
    @Override
    public int funtionCaulator(Integer soMot, Integer soHai, String calculation) {
        switch (calculation){
            case "+":
               return soMot+soHai;
               case "-":
               return soMot-soHai;
               case "*":
               return soMot*soHai;
               case "/":
               return soMot/soHai;
        }
        return Integer.parseInt(calculation);
    }
}
