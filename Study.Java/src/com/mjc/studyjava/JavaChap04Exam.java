package com.mjc.studyjava;

import java.util.ArrayList;

public class JavaChap04Exam {

    public int solve03() {
        int a = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                a += i;
            }
        }
        return a;
    }

    public String solve05() {
        int a = 0;
        int b = 0;

        while (a + b != 5) {
            a = (int) (Math.random() * 6 + 1);
            b = (int) (Math.random() * 6 + 1);
            System.out.print("(" + a + ", " + b + ")");
        }
        String s = "둘의 합이" + a + ", " + b + "일 때 5가 됩니다.";
        return s;
    }

    public String solve06() {
        for(int i = 0; i <= 4; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
        }
        String s = "결과입니다.";
        return s;
    }
}