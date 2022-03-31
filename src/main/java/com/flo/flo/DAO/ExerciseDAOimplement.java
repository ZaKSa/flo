package com.flo.flo.DAO;

import com.flo.flo.models.Exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class ExerciseDAOimplement implements ExerciseDAO {

    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
    private static Map<Integer, Exercise> exercises = new HashMap<>();

    static {
        Exercise exercise1 = new Exercise();
        exercise1.setId_ex(AUTO_ID.getAndIncrement());
        exercise1.setName_ex("Cheesecake");
        exercise1.setEnergy_consumption(200.0);
        exercise1.setDuration(60);
        exercises.put(Math.toIntExact(exercise1.getId_ex()), exercise1);

    }

    @Override
    public List<Exercise> allExercise() {
        return new ArrayList<>(exercises.values());
    }

    @Override
    public void add_ex(Exercise exercise) {
        exercise.setId_ex(AUTO_ID.getAndIncrement());
        exercises.put(exercise.getId_ex(), exercise);
    }

    @Override
    public void delete_ex(Exercise exercise) {
        exercises.remove(exercise.getId_ex());
    }

    @Override
    public void edit_ex(Exercise exercise) {
        exercises.put(exercise.getId_ex(), exercise);
    }

    @Override
    public Exercise getById_ex(int id) {
        return exercises.get(id);
    }
}
