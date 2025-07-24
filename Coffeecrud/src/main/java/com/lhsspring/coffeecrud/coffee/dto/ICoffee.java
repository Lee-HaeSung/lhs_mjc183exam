package com.lhsspring.coffeecrud.coffee.dto;

public interface ICoffee {
    Long getId();
    void setId(Long id);

    String getName();
    void setName(String name);

    int getPrice();
    void setPrice(int price);

    String getsource();
    void setsource(String source);

    String getshot();
    void setshot(String shot);

    default String getCoffeeFullInfo() {
        return String.format("[ID:%d, 메뉴:%s, 가격:%s, 원산지" +
                        ":%s, 샷추가:%s]"
                , this.getId()
                , this.getName()
                , this.getPrice()
                , this.getsource()
                , this.getshot()
        );
    }
}
