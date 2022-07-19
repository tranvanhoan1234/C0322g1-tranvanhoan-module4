package com.example.service;

import com.example.modle.PersonalMusicPlayerApp;

import java.util.List;

public interface IPersonaIMusicService {


    List<PersonalMusicPlayerApp> findAll();

    void save(PersonalMusicPlayerApp song);

    PersonalMusicPlayerApp findById(Integer id);

    void edit(PersonalMusicPlayerApp song);

    void delete(Integer id);
}
