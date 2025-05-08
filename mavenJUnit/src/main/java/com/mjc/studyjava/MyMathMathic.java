package com.mjc.studyjava;

public class MyMathMathic {
    public int add(int a, int b){
        return a+b;
    }

    public int sub(int a, int b){
        return a-b;
    }

    public int mul(int a, int b){
        return a*b;
    }

    public int divM(int a, int b){
        return a/b;
    }

    public int divN(int a, int b){
        return a%b;
    }

    public boolean same(int a, int b){
        return a==b;
    }

    public boolean same(String a, String b){
        return a.equals(b);
    }

    public boolean notSame(int a, int b){
        return a!=b;
    }

    public boolean big(int a, int b){
        return a>b;
    }

    public boolean small(int a, int b){
        return a<b;
    }

    public int shiftLeft(int a, byte b){
        return (int)a << b;
    }

    public int shiftRight(int a, byte b){
        return (int)a >> b;
    }

    public int shiftRight0(int a, byte b){
        return (int)a >>> b;
    }

    public long square(int a, byte b){
        long result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    public int absolute(int a) {
        return Math.abs(a);
    }

    public String toHex(int a){
        String HexString = Integer.toHexString(a);
        return HexString;
    }

    public String toBin(int a){
        String BinaryString = Integer.toBinaryString(a);
        return BinaryString;
    }

    public String toOct(int a){
        String OctalString = Integer.toOctalString(a);
        return OctalString;
    }

    public int toDec(String a){
        int decimal = Integer.parseInt(a);
        return decimal;
    }
}