package com.mjc.studyjava.abstractj;

public class Driver {
    String name;
    int age;
    Vehicle vehicle;

    public Driver(String name, int age, Vehicle vehicle){
        this.name = name;
        this.age = age;
        this.vehicle = vehicle;
    }

    void drive(){
        if(vehicle instanceof Truck truck){
            System.out.println("트럭 " + truck.name + "은 " + truck.wheelCount + "개의 바퀴로 이동한다.");
        } else if(vehicle instanceof Bicycle bicycle){
            System.out.println("자전거 " + bicycle.name + "은 " + bicycle.wheelCount + "개의 바퀴로 이동한다." );
        }
        else {
            System.out.println("알 수 없는 차량입니다.");
        }
    }

    void brake(){
        if (vehicle instanceof Truck) {
            Truck truck = (Truck) vehicle;
            System.out.println("트럭 " + truck.name + "은 정지한다.");
        } else if (vehicle instanceof Bicycle) {
            Bicycle bicycle = (Bicycle) vehicle;
            System.out.println("자전거 " + bicycle.name + "는 정지한다.");
        } else {
            System.out.println("알 수 없는 차량입니다.");
        }
    }
}
