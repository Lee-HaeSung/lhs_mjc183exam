package com.mjc.studyjava;

public class Printer {
    public static void println(int a) {
        System.out.println(a);
    }
//    public void println(int a) { //객체를 생성하여 호출할 때
//        System.out.println(a);
//    }

    public static void println(boolean a) {
        System.out.println(a);
    }
//    public void println(boolean a) { //객체를 생성하여 호출할 때
//        System.out.println(a);
//    }

    public static void println(double a) {
        System.out.println(a);
    }
//    public void println(double a) { //객체를 생성하여 호출할 때
//        System.out.println(a);
//    }

    public static void println(String a) {
        System.out.println(a);
    }
//    public void println(String a) { //객체를 생성하여 호출할 때
//        System.out.println(a);
//    }

    public static void main(String[] args) {
    Printer.println(10);
    Printer.println(true);
    Printer.println(5.7);
    Printer.println("홍길동");
    }
}
