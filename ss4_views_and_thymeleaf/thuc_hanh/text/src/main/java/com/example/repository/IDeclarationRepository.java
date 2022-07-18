package com.example.repository;

import com.example.model.Declaration;

import java.util.List;

public interface IDeclarationRepository {


    void save(Declaration declaration);


    List<Declaration> findAll(Declaration declaration);

}
