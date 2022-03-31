package com.flo.flo.DAO;

import com.flo.flo.models.Plans_exercises_ID;

import java.util.List;

public interface PlansExercisesIdDAO {
    List<Plans_exercises_ID> allPlansExercisesId();
    void add_pei(Plans_exercises_ID PlansExercisesId);
    void delete_pei(Plans_exercises_ID PlansExercisesId);
    void edit_pei(Plans_exercises_ID PlansExercisesId);
    Plans_exercises_ID getById_pei(int id);
}
