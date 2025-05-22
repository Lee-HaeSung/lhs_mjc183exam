package com.mjc.studyjava;

public class Parrot extends Bird{
    @Override
    public void fly() {
        System.out.println(name + "는 낮게 난다.");
    }

    @Override
    public void eat(Object feed) {
        if (feed instanceof String) {
            System.out.println(name + "는 " + feed + "를 먹는다.\n");
        } else {
            System.out.println(name + "는 먹을 수 없는 것을 받았다.\n");
        }
    }

    @Override
    public Parrot reproduce(String newName){
        Parrot parrot = new Parrot();
        parrot.name = newName;
        return parrot;
    }
}