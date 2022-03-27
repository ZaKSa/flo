package com.flo.flo.controllers;

import com.flo.flo.models.Products;
import com.flo.flo.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public String productsMain(Model model) {
        Iterable<Products> foods = productRepository.findAll();
        model.addAttribute("products", foods);
        return "products-main";
    }
}
