package com.AInutricao.service;

import com.AInutricao.model.Exercise;

import java.util.List;

public interface ExerciseService {
    Exercise createExercise(Exercise exercise);
    Exercise updateExercise(Long id, Exercise exercise);
    void deleteExercise(Long id);
    Exercise getExerciseById(Long id);
    List<Exercise> getAllExercises();
}
