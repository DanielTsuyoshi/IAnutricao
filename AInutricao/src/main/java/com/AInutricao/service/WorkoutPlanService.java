package com.AInutricao.service;

import com.AInutricao.model.WorkoutPlan;

import java.util.List;

public interface WorkoutPlanService {
    WorkoutPlan createWorkoutPlan(WorkoutPlan workoutPlan);
    WorkoutPlan updateWorkoutPlan(Long id, WorkoutPlan workoutPlan);
    void deleteWorkoutPlan(Long id);
    WorkoutPlan getWorkoutPlanById(Long id);
    List<WorkoutPlan> getAllWorkoutPlans();
}
