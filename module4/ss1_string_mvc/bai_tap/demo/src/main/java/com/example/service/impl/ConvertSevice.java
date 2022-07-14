package com.example.service.impl;

import com.example.service.IConvertService;
import org.springframework.stereotype.Service;

@Service
public class ConvertSevice implements IConvertService {

    @Override
    public Integer convert(int usd) {
        return usd*23000;
    }
}
