package com.mjc.studyjava;

public class Mouse {
    private int pointx;
    private int pointy;

    public void moveMouse(int x, int y){
        pointx = x;
        pointy = y;
    }

    public void LeftClick(){
        System.out.println("마우스(" + pointx + ", " + pointy + ") 왼쪽버튼 클릭됨");
    }

    public void RightClick(){
        System.out.println("마우스(" + pointx + ", " + pointy + ") 오른쪽버튼 클릭됨");
    }



}
