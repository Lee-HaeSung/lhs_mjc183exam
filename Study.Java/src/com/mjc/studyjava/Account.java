package com.mjc.studyjava;

public class Account {
    private String accountNumber;
    private String accountName;
    private int balance;

    public Account(String accountNumber, String accountName) {
        this(accountNumber, accountName, 0);
    }

    public Account(String accountNumber, String accountName, int money){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    public static void main(String[] args) {
        Account account = new Account();

        account.setBalnce(10000);
        System.out.println("현재 잔고 : " + account.getBalance());

        account.setBalnce(-100);
        System.out.println("현재 잔고 : " + account.getBalance());

        account.setBalnce(2000000);
        System.out.println("현재 잔고 : " + account.getBalance());

        account.setBalnce(300000);
        System.out.println("현재 잔고 : " + account.getBalance());
    }
}
