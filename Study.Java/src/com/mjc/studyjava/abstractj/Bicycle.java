package com.mjc.studyjava.abstractj;

public class Bicycle extends Vehicle{
    String name;

    public Bicycle(String name, int wheelCount) {
        super(wheelCount);
        this.name = name;
    }

    public void move(){
        System.out.println("자전거" + name + "은 " + wheelCount + "개의 바퀴로 이동한다.");
    }

    public void stop(){
        System.out.println("트럭 " + name + "는 정지한다.");
    }

}
