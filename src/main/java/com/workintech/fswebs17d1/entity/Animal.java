package com.workintech.fswebs17d1.entity;

public class Animal {
    public Animal(int id,String name) {
        this.name = name;
        this.id = id;
    }

    private int id;
    private String name;

    public Integer getId() {
        return id;
    }

    public Animal() {

    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
