package com.example.repository;

import com.example.modle.PersonalMusicPlayerApp;

import java.util.List;

public interface IPersonIMusicRepository {
    List<PersonalMusicPlayerApp> findAll();
}
