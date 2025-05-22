package com.mjc.studyjava;

public class AnimalFarm {
    public static void main(String[] args){
        Animal animal = new Animal();
        animal.name = "사자";
        animal.eat("고기");
        animal.sleep();
        animal.move();

        Bird bird = new Bird();
        bird.name = "부엉이";
        bird.flap();
        bird.fly();

        Parrot parrot = new Parrot();
        parrot.name = "앵무새";
        parrot.fly();
        parrot.eat("해바라기씨");

        Eagle eagle = new Eagle();
        eagle.name = "대머리독수리";
        eagle.fly();
        eagle.eat(new Animal("설치류"));

        Mammalia mammalia = new Mammalia();
        mammalia.name = "캥거루";
        mammalia.feedingMilk();
        mammalia.eat("풀");

        Herbivore herbivore = new Herbivore();
        herbivore.name = "코알라";
        herbivore.feedingMilk();
        herbivore.eat("유칼립투스");

        Carnivore carnivore = new Carnivore();
        carnivore.name = "표범";
        carnivore.feedingMilk();
        carnivore.eat(new Herbivore("얼룩말"));


    }
}
