package com.mjc.studyjava;

public class ShopService {

    private static ShopService ss = new ShopService();

    private ShopService(){

    }

    public static ShopService getInstance(){
        return ss;
    }

    public static void main(String[] args) {
        ShopService obj1 = ShopService.getInstance();
        ShopService obj2 = ShopService.getInstance();

        if(obj1 == obj2){
            System.out.println("같은 ShopService 객체입니다.");
        } else{
            System.out.println("다른 ShopService 객체입니다.");
        }
    }
}
