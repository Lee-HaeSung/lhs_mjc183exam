package com.mjc.studyjava.abstractj;

public class Move {
    public static void main(String[] args){
        Truck truck = new Truck("타요", 4);

        Bicycle bicycle = new Bicycle("윈드브레이커", 2);

        Driver driver1 = new Driver("백룡", 365, truck);
        driver1.drive();
        driver1.brake();

        Driver driver2 = new Driver("흑룡", 385, bicycle);
        driver2.drive();
        driver2.brake();
    }
}
