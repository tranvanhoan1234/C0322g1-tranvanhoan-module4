package com.example.repository.impl;

import com.example.modle.PersonalMusicPlayerApp;
import com.example.repository.IPersonIMusicRepository;
import com.example.service.impl.Dbconnection;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class PersonalMusicRepository implements IPersonIMusicRepository {
    @Override
    public List<PersonalMusicPlayerApp> findAll() {
        TypedQuery<PersonalMusicPlayerApp> typedQuery= Dbconnection.entityManager.createQuery("select s from Song s", PersonalMusicPlayerApp.class);
        return typedQuery.getResultList();
    }
}
