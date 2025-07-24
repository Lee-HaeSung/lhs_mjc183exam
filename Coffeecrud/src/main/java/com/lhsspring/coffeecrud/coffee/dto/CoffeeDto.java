package com.lhsspring.coffeecrud.coffee.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CoffeeDto {
    private int id;
    private String name;
    private int price;
    private String source;
    private String shot;
}
