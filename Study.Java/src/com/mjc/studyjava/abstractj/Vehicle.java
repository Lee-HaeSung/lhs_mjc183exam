package com.mjc.studyjava.abstractj;

public abstract class Vehicle {
    int wheelCount;

    public Vehicle(int wheelCount){
        this.wheelCount = wheelCount;
    }

    abstract void move();
    abstract void stop();
}
