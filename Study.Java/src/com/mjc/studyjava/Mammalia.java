package com.mjc.studyjava;

public class Mammalia extends Animal {
   public void feedingMilk(){
       System.out.println(name + "는 젖을 먹인다.");
   }

   public void eat(Object feed) {
       if (feed instanceof String) {
           System.out.println(name + "는 " + feed + "를 먹는다.\n");
       } else {
           System.out.println(name + "는 먹을 수 없는 것을 받았다.");
       }
   }

   @Override
   public Mammalia reproduce(String newName){
       Mammalia mammalia = new Mammalia();
       mammalia.name = newName;
       return mammalia;
   }
}
