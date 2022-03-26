package com.flo.flo.controllers;

import com.flo.flo.models.Food;
import com.flo.flo.repo.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FoodController {

    @Autowired
    private FoodRepository foodRepository;

    @GetMapping("/food")
    public String foodMain(Model model) {
        Iterable<Food> foods = foodRepository.findAll();
        model.addAttribute("foods", foods);
        return "food-main";
    }
}
