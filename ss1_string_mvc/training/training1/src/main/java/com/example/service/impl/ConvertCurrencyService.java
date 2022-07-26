package com.example.service.impl;

import com.example.service.IConvertCurrencyService;
import org.springframework.stereotype.Service;

@Service
public class ConvertCurrencyService implements IConvertCurrencyService {

    @Override
    public Integer convert(Integer usd1) {
    return usd1*23000;
    }
}
