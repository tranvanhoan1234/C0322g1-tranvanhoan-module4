package com.example.repository.impl;

import com.example.modle.PersonalMusicPlayerApp;
import com.example.repository.IPersonIMusicRepository;
import com.example.repository.Dbconnection;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
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

    @Override
    public void save(PersonalMusicPlayerApp song) {
        EntityTransaction entityTransaction=Dbconnection.entityManager.getTransaction();
        entityTransaction.begin();
        Dbconnection.entityManager.persist(song);
        entityTransaction.commit();
    }

    @Override
    public PersonalMusicPlayerApp findById(Integer id) {
        TypedQuery<PersonalMusicPlayerApp> typedQuery=Dbconnection.entityManager.createQuery
                ("select s from song as s where s.id=:id", PersonalMusicPlayerApp.class);
        typedQuery.setParameter("id", id);
        try {
            return typedQuery.getSingleResult();
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public void edit(PersonalMusicPlayerApp song) {
        EntityTransaction entityTransaction = Dbconnection.entityManager.getTransaction();
        entityTransaction.begin();
        Dbconnection.entityManager.merge(song);
        entityTransaction.commit();

    }

    @Override
    public void delete(Integer id) {
        EntityTransaction entityTransaction = Dbconnection.entityManager.getTransaction();
        entityTransaction.begin();
        Dbconnection.entityManager.remove(Dbconnection.entityManager.find(PersonalMusicPlayerApp.class,id));
        entityTransaction.commit();
    }
}
