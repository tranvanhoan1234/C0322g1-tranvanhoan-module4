package com.example.music.service;

import com.example.music.model.Music;

import java.util.List;

public interface IMusicService
{
    List<Music> findAll();

    void save(Music song);

//    void save(Music song);
//
//    Music findById(Integer id);
//
//    void edit(Music song);
//
//    void delete(Integer id);
}
