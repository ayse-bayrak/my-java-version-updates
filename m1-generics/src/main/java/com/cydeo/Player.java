package com.cydeo;

public abstract class Player { // i did abstract class because i do not want to create an object from player class and i want to create templates
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
