package com.example.service;

import com.example.model.Declaration;

import java.util.List;

public interface IDeclarationService {

    void save(Declaration declaration);

    List<Declaration> findAll(Declaration declaration);
}
