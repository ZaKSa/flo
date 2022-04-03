package com.flo.flo.controllers;

import com.flo.flo.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ExerciseController {
    @Autowired
    private ProductRepository exercisesRepository;
}
