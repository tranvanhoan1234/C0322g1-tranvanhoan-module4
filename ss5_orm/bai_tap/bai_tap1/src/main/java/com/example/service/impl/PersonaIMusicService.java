package com.example.service.impl;

import com.example.modle.PersonalMusicPlayerApp;
import com.example.repository.IPersonIMusicRepository;
import com.example.service.IPersonaIMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaIMusicService implements IPersonaIMusicService {
    @Autowired
    IPersonIMusicRepository iPersonIMusicRepository;
    @Override
    public List<PersonalMusicPlayerApp> findAll() {
        return iPersonIMusicRepository.findAll();
    }

    @Override
    public void save(PersonalMusicPlayerApp song) {
iPersonIMusicRepository.save(song);
    }

    @Override
    public PersonalMusicPlayerApp findById(Integer id) {
        return iPersonIMusicRepository.findById(id);
    }

    @Override
    public void edit(PersonalMusicPlayerApp song) {
iPersonIMusicRepository.edit(song);
    }

    @Override
    public void delete(Integer id) {
iPersonIMusicRepository.delete(id);
    }
}
