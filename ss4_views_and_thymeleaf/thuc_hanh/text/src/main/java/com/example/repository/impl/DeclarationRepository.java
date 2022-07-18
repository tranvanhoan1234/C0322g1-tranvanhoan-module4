package com.example.repository.impl;

import com.example.model.Declaration;
import com.example.repository.IDeclarationRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DeclarationRepository implements IDeclarationRepository {
    private static List<Declaration>declarationList=new ArrayList<>();
    static {
        declarationList.add(new Declaration("toan","1997","aaa","12-2-2021","12-1-2022","trong vòng 14"));
        declarationList.add(new Declaration("hoang","1997","aaa","12-2-2021","12-1-2022","trong vòng 14"));
        declarationList.add(new Declaration("tuán","1997","aaa","12-2-2021","12-1-2022","trong vòng 14"));
        declarationList.add(new Declaration("sang","1997","aaa","12-2-2021","12-1-2022","trong vòng 14"));
        declarationList.add(new Declaration("tri","1997","aaa","12-2-2021","12-1-2022","trong vòng 14"));


    }

    @Override
    public void save(Declaration declaration) {
declarationList.add(declaration);

    }

    @Override
    public List<Declaration> findAll(Declaration declaration) {
        return declarationList;
    }
}
