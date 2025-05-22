package com.mjc.studyjava;

public class Carnivore extends  Mammalia{
    public void eat(Object feed) {
        if (feed instanceof Herbivore herbivore) {
            System.out.println(name + "은 " + feed + "를 먹는다.\n");
        } else {
            System.out.println(name + "는 먹을 수 없는 것을 받았다.\n");
        }
    }

    @Override
    public Carnivore reproduce(String newName){
        Carnivore carnivore = new Carnivore();
        carnivore.name = newName;
        return carnivore;
    }
}
