package com.mjc.studyjava;

public class Computer {
    private String comName = "Computer";
    private String comCPU;
    private String comRam;
    private String comStorage;
    private String comGraphic;
    private Mouse mouse;

    public Computer() {
        mouse = new Mouse();
    }

    public void moveMouse(int x, int y){
        mouse.moveMouse(x, y);
    }


    public void clickLeft() {
        mouse.LeftClick();
    }

    public void clickRight() {
        mouse.RightClick();
    }


    public Computer(String a){
        comName = a;
    }

    public Computer(String a,String b){
        comName = a;
        comCPU = b;
    }

    public Computer(String a,String b,String c){
        comName = a;
        comCPU = b;
        comRam = c;
    }

    public Computer(String a,String b,String c,String d){
        comName = a;
        comCPU = b;
        comRam = c;
        comStorage = d;
    }

    public Computer(String a,String b,String c,String d,String e){
        comName = a;
        comCPU = b;
        comRam = c;
        comStorage = d;
        comGraphic = e;
    }

    public void comOn(){
        System.out.println("\n" + comName + "가 켜졌습니다.");
    }

    public void comOff(){
        System.out.println(comName + "가 꺼졌습니다.\n");
    }

    public void information(){
        if (comCPU == null){
            System.out.println("CPU : 조립중입니다.");
        }
        else {
            System.out.println("CPU : " + comCPU);
        }
        if (comRam == null){
            System.out.println("Ram : 조립중입니다.");
        }
        else {
            System.out.println("RAM : " + comRam);
        }
        if (comStorage == null){
            System.out.println("Storage : 조립중입니다.");
        }
        else {
            System.out.println("Storage : " + comStorage);
        }
        if (comGraphic == null){
            System.out.println("Graphic : 조립중입니다.");
        }
        else {
            System.out.println("Graphic : " + comGraphic);
        }
    }

    public static void main(String[] args){
        Computer c1 = new Computer("트랄랄레로");
        c1.comOn();
        c1.information();
        c1.comOff();

        Computer c2 = new Computer("봄바르딜로크로코딜로","Gen9_i5","32GB");
        c2.comOn();
        c2.information();
        c2.comOff();

        Computer c3 = new Computer("퉁퉁퉁퉁퉁사후르","Gen9_i7");
        c3.comOn();
        c3.information();
        c3.comOff();

        Computer c4 = new Computer("리릴리라릴라","Gen9_i9","16GB","SSD 1000GB");
        c4.comOn();
        c4.information();
        c4.comOff();

        Computer c5 = new Computer("침팬치니바나나니","Gen9_i5","4GB","SSD 500GB","Intel_A770");
        c5.comOn();
        c5.information();
        c5.comOff();

        Computer ms = new Computer();
        ms.moveMouse(200,400);
        ms.clickLeft();
        ms.moveMouse(600,800);
        ms.clickRight();

    }
}

