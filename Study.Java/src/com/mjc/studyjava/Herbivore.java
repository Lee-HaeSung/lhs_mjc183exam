package com.mjc.studyjava;

public class Herbivore extends Mammalia{
    public Herbivore(){}

    public Herbivore(String name){
        this.name = name;
    }

    public Herbivore reproduce(String newName){
        Herbivore herbivore = new Herbivore();
        herbivore.name = newName;
        return herbivore;
    }
}
