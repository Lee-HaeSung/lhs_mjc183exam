package com.mjc813.food_web.common;

import com.mjc813.food_web.food.dto.FoodIngsResponseDto;
import com.mjc813.food_web.food.service.FoodJpaTransactionService;
import com.mjc813.food_web.member.dto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MenuController {

    @Autowired
    private FoodJpaTransactionService foodJpaTransactionService;

    @GetMapping("/food_category")
    public String menuFoodCategory() {
        return "/food/food_category";
    }

    @GetMapping("/ingredient_category")
    public String menuIngredientCategory() {
        return "/food/ingredient_category";
    }

    @GetMapping("/ingredient")
    public String menuIngredient() {
        return "/food/ingredient";
    }

    @GetMapping("/food")
    public String menuFood() {
        return "/food/food";
    }

    @GetMapping("/member")
    public String member() {
        return "member/members";
    }

    @GetMapping("/signpage")
    public String everyone(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if ( authentication.getPrincipal() instanceof MemberDto ) {
            MemberDto loginUser = (MemberDto) authentication.getPrincipal();
            model.addAttribute("loginUser", loginUser);
        } else {
            model.addAttribute("loginUser", null);
        }
        return "signpage/home";
    }

    @GetMapping("/main")
    public String mainHome(Model model) {
        try {
            List<FoodIngsResponseDto> all = this.foodJpaTransactionService.getFoodsAndIngredientList();
            model.addAttribute("foodList", all);
            return "main/home";
        } catch ( Throwable e ) {
            return "error/500";
        }
    }
}
