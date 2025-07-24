package com.lhsspring.coffeecrud.coffee.controller;

import com.lhsspring.coffeecrud.coffee.dto.CoffeeDto;
import com.lhsspring.coffeecrud.coffee.service.CoffeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

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
        return "redirect:/coffee/menu";
    }

    @GetMapping("coffee/view")
    public String view(@RequestParam("id") int id, Model model) {
        try {
            CoffeeDto result = this.coffeeRepository.selectOne(id);
            model.addAttribute("CoffeeDto", result);
        } catch (Throwable e){
            System.out.println(e.toString());
        }
        return "coffee/view";
    }

    @GetMapping("coffee/modify")
    public String modify(@RequestParam("id") int id, Model model){
        try {
            CoffeeDto result = this.coffeeRepository.selectOne(id);
            model.addAttribute("CoffeeDto", result);
        }   catch (Throwable e){
            System.out.println(e.toString());
        }
        return "coffee/modify";
    }

    @PostMapping("coffee/update")
    public String update(@ModelAttribute CoffeeDto coffeeDto) {
        try {
            // sql 의 update 문장을 실행한다.
            this.coffeeRepository.update(coffeeDto);
        } catch (Throwable e) {
            System.out.println(e.toString());
        }
        return "redirect:/";// 정상 실행하면 redirect:/contact/list
    }

    @PostMapping("/coffee/delete")
    public String delete(@ModelAttribute CoffeeDto obj) {
        this.coffeeRepository.deleteById(obj.getId());
        return "redirect:/";
    }

    @GetMapping("coffee/list")
    public String selectAll(Model model
    ) {
        List<CoffeeDto> contacts = null;
        try {
            contacts = this.coffeeRepository.selectAll();
        } catch (Throwable e) {
            System.out.println(e.toString());
        }
        model.addAttribute("contacts", contacts);
        return "coffee/list";
    }
}
