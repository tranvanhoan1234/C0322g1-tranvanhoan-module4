package com.example.repository;

import com.example.modle.PersonalMusicPlayerApp;

import java.util.List;

public interface IPersonIMusicRepository {
    List<PersonalMusicPlayerApp> findAll();

    void save(PersonalMusicPlayerApp song);

    PersonalMusicPlayerApp findById(Integer id);

    void edit(PersonalMusicPlayerApp song);

    void delete(Integer id);
}
