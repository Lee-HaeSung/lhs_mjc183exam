package com.lhsspring.coffeecrud.coffee.service;

import com.lhsspring.coffeecrud.coffee.dto.CoffeeDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ICoffeeMybatisMapper {
    public void insert(CoffeeDto coffeeDto);
    public CoffeeDto selectOne(int id);
    public void update(CoffeeDto coffeeDto);
    public void deleteById(int id);
    public List<CoffeeDto> selectAll();
}
