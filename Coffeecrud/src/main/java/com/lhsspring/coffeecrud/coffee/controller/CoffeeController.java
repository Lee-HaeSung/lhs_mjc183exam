package com.lhsspring.coffeecrud.coffee.controller;

import com.lhsspring.coffeecrud.coffee.dto.CoffeeDto;
import com.lhsspring.coffeecrud.coffee.service.CoffeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CoffeeController {

    @Autowired
    private CoffeeRepository coffeeRepository;

    @GetMapping("/cafe/location")
    public String location() {
        return "coffee/location";
    }

    @GetMapping("/coffee/menu")
    public String menu(){
        return "coffee/insert";
    }

    @PostMapping("/coffee/insert")
    public String insert(@ModelAttribute CoffeeDto insertDto) {
        try{
            coffeeRepository.insert(insertDto);
            System.out.println(insertDto);
        } catch (Throwable e){
            System.out.println(e.toString());
        }
        return "redirect:/";
    }

}
