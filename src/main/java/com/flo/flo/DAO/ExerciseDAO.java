package com.flo.flo.DAO;

import com.flo.flo.models.Exercise;

import java.util.List;

public interface ExerciseDAO {
    List<Exercise> allExercise();
    void add_ex(Exercise exercise);
    void delete_ex(Exercise exercise);
    void edit_ex(Exercise exercise);
    Exercise getById_ex(int id);
}
