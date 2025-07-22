package com.lhsspring.mpacurd.animal.controller;

import com.lhsspring.mpacurd.animal.dto.AnimalDto;
import com.lhsspring.mpacurd.animal.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping("/animal/a")
    public String testA(Model model,
                        @RequestParam("name1") String name1,
                        @RequestParam("name2") String name2
    ){
        model.addAttribute("name1", name1);
        model.addAttribute("name2", name2);
        return "/a";
    }

    @GetMapping("/animal/{name1}/{name2}")
    public String b(Model model,
                    @PathVariable("name1") String name1,
                    @PathVariable("name2") String name2){
        return "/b";
    }

    @GetMapping("/animal/addview")
    public String addview(){
        return "/animal/addview";
    }

    @PostMapping("/animal/insert")
    public String insert(
           // @RequestParam("name") String name,
           // @RequestParam("age") String age,
           // @RequestParam("kind") String kind)
            @ModelAttribute AnimalDto animal
    ) {
        //화면에서 받은 값을 DB까지 저장해야 한다.
        //화면에서 전달 받은 값이 유효한지 valid 체크 해야한다.
        try {
            this.animalService.insert(animal);
        } catch (Throwable th) {
            System.err.println(th.toString());
        }
        return "redirect:/";
    }

    @GetMapping("/animal/list")
    public String list(Model model) {
        try {
            List<AnimalDto> all = this.animalService.findAll();
            model.addAttribute("listWord", all);
        } catch (Throwable e) {
            System.err.println(e.toString());
        }
        return "/animal/list";
    }

    @GetMapping("/animal/view")
    public String view1(Model model
            , @RequestParam("id") Long id) {
        try {
            AnimalDto byId = this.animalService.findById(id);
            model.addAttribute("data", byId);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return "/animal/view";
    }
}
