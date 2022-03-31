package com.flo.flo.DAO;

import com.flo.flo.models.Products;

import java.util.List;

public interface ProductDAO {
    List<Products> allFood();
    void add_pr(Products food);
    void delete_pr(Products food);
    void edit_pr(Products food);
    Products getById_pr(int id);
}
