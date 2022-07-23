package com.example.form_waiting.service;

import com.example.form_waiting.model.FormWaiting;

import java.util.List;

public interface IFormService {
    List<FormWaiting> findAll();
   void save(FormWaiting formWaiting);

}
