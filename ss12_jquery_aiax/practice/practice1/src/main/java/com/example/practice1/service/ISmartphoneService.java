package com.example.practice1.service;

import com.example.practice1.model.SmartPhone;

import java.util.Optional;

public interface ISmartphoneService {

SmartPhone save(SmartPhone smartPhone);

   Iterable<SmartPhone>findAll();

   Optional<SmartPhone> findById(Long id);

   void remove(Long id);
  SmartPhone edit(SmartPhone smartPhone);

}
