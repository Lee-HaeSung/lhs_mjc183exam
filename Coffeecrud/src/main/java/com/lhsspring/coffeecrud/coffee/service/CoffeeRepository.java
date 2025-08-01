package com.lhsspring.coffeecrud.coffee.service;

import com.lhsspring.coffeecrud.coffee.dto.CoffeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeRepository {
    @Autowired
    public ICoffeeMybatisMapper coffeeMybatisMapper;

    public CoffeeDto insert(CoffeeDto menu) {
        this.coffeeMybatisMapper.insert(menu);
        return menu;
    }

    public CoffeeDto selectOne(int id) {
        return this.coffeeMybatisMapper.selectOne(id);
    }

    public List<CoffeeDto> selectAll() {
        return this.coffeeMybatisMapper.selectAll();
    }

    public void update(CoffeeDto coffeeDto) {
        this.coffeeMybatisMapper.update(coffeeDto);
}
    public void deleteById(int id) {
        this.coffeeMybatisMapper.deleteById(id);
    }
}
