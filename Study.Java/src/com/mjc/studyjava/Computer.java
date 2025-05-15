package com.mjc.studyjava;

public class Computer {
    String comName = "";
    String comCPU = "";
    String comRam = "";
    String comStorage = "";
    String comGraphic = "";

    public Computer(String a,String b,String c,String d,String e){
        comName = a;
        comCPU = b;
        comRam = c;
        comStorage = d;
        comGraphic = e;
    }

    public void comOn(){
        System.out.println(comName + "가 켜졌습니다.");
    }

    public void comOff(){
        System.out.println(comName + "가 꺼졌습니다.\n");
    }

    public void information(){
        System.out.println("CPU : " + comCPU);
        System.out.println("RAM : " + comRam);
        System.out.println("Storage : " + comStorage);
        System.out.println("Graphic : " + comGraphic);
    }

    public static void main(String[] args){
        Computer c1 = new Computer("트랄랄레로","Gen9_i9","16GB","SSD 1000GB","RTX_4080");
        c1.comOn();
        c1.information();
        c1.comOff();

        Computer c2 = new Computer("봄바르딜로크로코딜로","Gen9_i5","32GB","SSD 2000GB","RTX_4080");
        c2.comOn();
        c2.information();
        c2.comOff();

        Computer c3 = new Computer("퉁퉁퉁퉁퉁사후르","Gen9_i7","8GB","SSD 1000GB","Intel_A770");
        c3.comOn();
        c3.information();
        c3.comOff();

        Computer c4 = new Computer("리릴리라릴라","Gen9_i9","16GB","SSD 1000GB","GTX_1660");
        c4.comOn();
        c4.information();
        c4.comOff();

        Computer c5 = new Computer("침팬치니바나나니","Gen9_i5","4GB","SSD 500GB","Intel_A770");
        c5.comOn();
        c5.information();
        c5.comOff();
    }
}

