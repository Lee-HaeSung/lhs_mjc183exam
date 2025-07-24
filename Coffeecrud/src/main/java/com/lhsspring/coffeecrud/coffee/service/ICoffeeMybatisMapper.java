package com.lhsspring.coffeecrud.coffee.service;

import com.lhsspring.coffeecrud.coffee.dto.CoffeeDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ICoffeeMybatisMapper {
    public void insert(CoffeeDto coffeeDto);
}
