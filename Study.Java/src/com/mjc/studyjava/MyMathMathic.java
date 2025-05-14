package com.mjc.studyjava;
import java.math.BigDecimal;
import java.util.Random;

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
        if (a == null || b == null) {
            return false; // null 입력 시 null 반환
        }
        return a.equals(b);
    }

    public boolean notsame(int a, int b){
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
        if(a == null){
            return 0;
        }

        int decimal = Integer.parseInt(a);
        return decimal;
    }

    public int avg(int [] array){
        int arrAvg = 0;
        int arrSum = 0;

        if (array == null) {
            return 0; // null 입력 시 null 반환
        }

        for (int i = 0; i < array.length; i++){
            arrSum += array[i];
        }
        arrAvg = arrSum / array.length;
        return arrAvg;
    }

    public int sum(int [] array){
        int arrSum = 0;

        if (array == null) {
            return 0; // null 입력 시 null 반환
        }

        for (int i = 0; i < array.length; i++){
            arrSum += array[i];
        }
        return arrSum;
    }

    public int sumOfNumber(int [] array, int number){
        int arrSum = 0;

        if (array == null) {
            return 0; // null 입력 시 null 반환
        }

        for (int i = 0; i < array.length; i++){
            if(array[i] % number == 0) {
                arrSum += array[i];
            }
        }
        return arrSum;
    }

    public int sumOfLoop(int a, int b){
        int sum = 0;
        while(a <= b) {
            sum += a;
            a++;
        }
        return sum;
    }

    public int sumOfFav(int a, int b){
        if(a > b) {
            return 0;
        }
        return a + sumOfFav(a +1 , b);
    }

    public BigDecimal getBigDecimal(int n, int s){
        return new BigDecimal(n + "." + s);
    }

    public Integer[] getIntegerArray(int[] array){
        if (array == null) {
            return null; // null 입력 시 null 반환
        }

        Integer[] array2 = new Integer[array.length];

        for(int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        return array2;
    }

    public int[] makeRandomIntArray(int n) {
        int[] array = new int[n];

        return array;
    }

    public String makeEncryptString(String text, int n){
        if(text == null){
            return "";
        }

        if (n < 5){
            return "n은 5이상을 입력해주세요.";
        }

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();

        StringBuilder result = new StringBuilder();

        int textIndex = 0;

        int totalLength = (text.length() * n) + 1;

        for (int i = 0; i < totalLength; i++){
            if(i != 0 && i >= n && i % n == 0 && textIndex < text.length()){
                result.append(text.charAt(textIndex));
                textIndex++;
            }
            else {
                int randIndex = random.nextInt(chars.length());
                result.append(chars.charAt(randIndex));
            }
        }
        return result.toString();
    }

    public String makeDecryptString(String code, int n){
        if(code == null){
            return "";
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < code.length(); i++){
            if( i % n == 0 && i != 0){
                result.append(code.charAt(i));
            }
        }
        return result.toString();
    }
}
