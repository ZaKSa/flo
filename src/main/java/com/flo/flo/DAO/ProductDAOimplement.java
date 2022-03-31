package com.flo.flo.DAO;

import com.flo.flo.models.Products;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class ProductDAOimplement implements ProductDAO {

    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
    private static Map<Integer, Products> foods = new HashMap<>();

    static {
        Products food1 = new Products();
        food1.setId_pr(AUTO_ID.getAndIncrement());
        food1.setName_pr("Cheesecake");
        food1.setCaloric_content(200.0);
        food1.setWight_pr(101.1);
        foods.put(Math.toIntExact(food1.getId_pr()), food1);

    }

    @Override
    public List<Products> allFood() {
        return new ArrayList<>(foods.values());
    }

    @Override
    public void add_pr(Products food) {
        food.setId_pr(AUTO_ID.getAndIncrement());
        foods.put(food.getId_pr(), food);
    }

    @Override
    public void delete_pr(Products food) {
        foods.remove(food.getId_pr());
    }

    @Override
    public void edit_pr(Products food) {
        foods.put(food.getId_pr(), food);
    }

    @Override
    public Products getById_pr(int id) {
        return foods.get(id);
    }
}
