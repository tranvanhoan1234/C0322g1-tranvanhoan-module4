package com.example.practice1.service;

import com.example.practice1.model.SmartPhone;
import com.example.practice1.repository.ISmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SmartPhoneService implements ISmartphoneService{
    @Autowired
    ISmartphoneRepository iSmartphoneRepository;
    @Override
    public SmartPhone save(SmartPhone smartPhone) {
        return iSmartphoneRepository.save(smartPhone);
    }

    @Override
    public Iterable<SmartPhone> findAll() {
        return iSmartphoneRepository.findAll();
    }

    @Override
    public Optional<SmartPhone> findById(Long id) {
        return iSmartphoneRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        iSmartphoneRepository.deleteById(id);
    }

    @Override
    public SmartPhone edit(SmartPhone smartPhone) {
      return iSmartphoneRepository.save(smartPhone);
    }


}
