package com.example.service.impl;

import com.example.model.Declaration;
import com.example.repository.IDeclarationRepository;
import com.example.service.IDeclarationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeclarationService implements IDeclarationService {
    @Autowired
    IDeclarationRepository declarationRepository;

    @Override
    public void save(Declaration declaration) {

        declarationRepository.save(declaration);
    }

    @Override
    public List<Declaration> findAll(Declaration declaration) {

        return declarationRepository.findAll(declaration);
    }

}
