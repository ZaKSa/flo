package com.flo.flo.controllers;

import com.flo.flo.models.Food;
import com.flo.flo.models.Phy;
import com.flo.flo.repo.FoodRepository;
import com.flo.flo.repo.PhyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PhyController {

    @Autowired
    private PhyRepository phyRepository;

    @GetMapping("/phy")
    public String foodMain(Model model) {
        Iterable<Phy> phys = phyRepository.findAll();
        model.addAttribute("phys", phys);
        return "phy-main";
    }
}