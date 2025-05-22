package com.mjc.studyjava;

public class Eagle extends Bird{
    @Override
    public void fly(){
        System.out.println(name + "는 높이 난다.");
    }

    @Override
    public void eat(Object feed) {
        if (feed instanceof Animal animal) {
            System.out.println(name + "는 " + animal.name + "를 먹는다.\n");
        } else {
            System.out.println(name + "는 먹을 수 없는 것을 받았다.\n");
        }
    }


    @Override
    public Eagle reproduce (String newName){
        Eagle eagle = new Eagle();
        eagle.name = newName;
        return eagle;
    }
}
