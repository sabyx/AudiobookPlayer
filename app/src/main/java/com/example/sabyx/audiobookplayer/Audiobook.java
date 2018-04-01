package com.example.sabyx.audiobookplayer;

import java.io.Serializable;

public class Audiobook implements Serializable {

    private String name;
    private String author;
    private String description;
    private String duration;

    public Audiobook(String name, String author, String description, String duration) {
        this.name = name;
        this.author = author;
        this.description = description;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public String getDuration() {
        return duration;
    }
}
