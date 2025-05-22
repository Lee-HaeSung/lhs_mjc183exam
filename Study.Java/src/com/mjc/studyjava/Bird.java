package com.mjc.studyjava;

public class Bird extends Animal {
    private String wings = "날개";

    public void flap(){
        System.out.println(name+ "가 " + wings + "로 날개짓한다.");
    }

    public void fly(){
        System.out.println(name + "가 " + wings + "로 난다.\n");
    }

    @Override
    public Bird reproduce(String newName){
        Bird bird = new Bird();
        bird.name = newName;
        return bird;
    }
}
