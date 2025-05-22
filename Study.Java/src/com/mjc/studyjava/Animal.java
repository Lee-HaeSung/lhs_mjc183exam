package com.mjc.studyjava;

public class Animal {
    public String name;
    public int age;

    public Animal(){}

    public Animal(String name){
        this.name = name;
    }

    public void eat(Object feed){
        System.out.println(name + "가 " + feed +"를 먹는다.");
    }

    public void sleep(){
        System.out.println(name +"가 잔다.");
    }

    public void move(){
        System.out.println(name + "가 이동한다.\n");
    }

    Animal reproduce(String newName){
        Animal animal = new Animal();
        animal.name = newName;
        return animal;
    }

    @Override
    public String toString(){
        return name;
    }
}
