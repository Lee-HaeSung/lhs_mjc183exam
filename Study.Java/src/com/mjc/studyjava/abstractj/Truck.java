package com.mjc.studyjava.abstractj;

public class Truck extends Vehicle {
   public String name;
   public int ton;

    public Truck(String name, int wheelCount) {
        super(wheelCount);
        this.name = name;
    }

    @Override
    public void move(){
        System.out.println("트럭" + name + "은 " + wheelCount + "개의 바퀴로 이동한다.");
    }

    @Override
    public void stop(){
        System.out.println("트럭 " + name + "는 정지한다.");
    }
}
