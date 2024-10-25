package com.example.consumejokes.model;

import java.util.Date;

public class Joke {

    String category;
    Date date;
    JokeInner joke;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public JokeInner getJoke() {
        return joke;
    }

    public void setJoke(JokeInner joke) {
        this.joke = joke;
    }
}
