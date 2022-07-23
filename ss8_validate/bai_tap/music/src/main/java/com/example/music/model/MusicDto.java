package com.example.music.model;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class MusicDto implements Validator {
    private Integer id;
    @NotBlank(message = "name not blank")
    @Pattern(regexp = "^\\w{0,800}$", message = "tối đã 0>800 kí tưej")
    @Pattern(regexp = "'[a-zA-Z0-9\\+]*$'", message = "k chuaws casc kis tuwj ddawcj bieet")
    private String nameOfTheSong;
    @NotBlank(message = "not per khoong dc troosng")
    @Pattern(regexp = "^\\w{0,300}$", message = "tối đã 0>800 kí tưej")
    @Pattern(regexp = "'[a-zA-Z0-9\\+]*$'", message = "k chuaws casc kis tuwj ddawcj bieet")
    private String performingArtist;
    @NotBlank(message = "not kindOfMusic khoong dc troosng")
    @Pattern(regexp = "^\\w{0,1000}$", message = "tối đã 0>800 kí tưej")
    @Pattern(regexp = "'[a-zA-Z0-9\\+]*$'", message = "k chuaws casc kis tuwj ddawcj bieet")

    private String kindOfMusic;
    @NotBlank(message = "not songFilePath khoong dc troosng")
    @Pattern(regexp = "^\\w{0,800}$", message = "tối đã 0>800 kí tưej") 
    @Pattern(regexp = "'[a-zA-Z0-9\\+]*$'", message = "k chuaws casc kis tuwj ddawcj bieet")
    private String songFilePath;

    public MusicDto() {
    }

    public MusicDto(Integer id, String nameOfTheSong, String performingArtist, String kindOfMusic, String songFilePath) {
        this.id = id;
        this.nameOfTheSong = nameOfTheSong;
        this.performingArtist = performingArtist;
        this.kindOfMusic = kindOfMusic;
        this.songFilePath = songFilePath;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameOfTheSong() {
        return nameOfTheSong;
    }

    public void setNameOfTheSong(String nameOfTheSong) {
        this.nameOfTheSong = nameOfTheSong;
    }

    public String getPerformingArtist() {
        return performingArtist;
    }

    public void setPerformingArtist(String performingArtist) {
        this.performingArtist = performingArtist;
    }

    public String getKindOfMusic() {
        return kindOfMusic;
    }

    public void setKindOfMusic(String kindOfMusic) {
        this.kindOfMusic = kindOfMusic;
    }

    public String getSongFilePath() {
        return songFilePath;
    }

    public void setSongFilePath(String songFilePath) {
        this.songFilePath = songFilePath;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
