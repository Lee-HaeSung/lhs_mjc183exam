package com.mjc.studyjava;

import javax.xml.namespace.QName;

public class Member { //외부에서 받은 값으로 초기화 하도록 생성자 선언
    private String name;
    private String id;
    private String password;
    private int age;

    public Member(String a, String b) {
        name = a;
        id = b;
    }

    public String getName(){
        return name;
    }

    public String getId(){
        return id;
    }
}
