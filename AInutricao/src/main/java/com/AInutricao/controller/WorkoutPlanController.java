package com.AInutricao.controller;

import com.AInutricao.model.WorkoutPlan;
import com.AInutricao.service.WorkoutPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/workoutplans")
public class WorkoutPlanController {

    @Autowired
    private WorkoutPlanService workoutPlanService;

    @GetMapping
    public ResponseEntity<List<WorkoutPlan>> getAllWorkoutPlans() {
        List<WorkoutPlan> workoutPlans = workoutPlanService.getAllWorkoutPlans();
        return ResponseEntity.ok(workoutPlans);
    }

    @GetMapping("/{id}")
    public ResponseEntity<WorkoutPlan> getWorkoutPlanById(@PathVariable Long id) {
        WorkoutPlan workoutPlan = workoutPlanService.getWorkoutPlanById(id);
        return ResponseEntity.ok(workoutPlan);
    }

    @PostMapping
    public ResponseEntity<WorkoutPlan> createWorkoutPlan(@Valid @RequestBody WorkoutPlan workoutPlan) {
        WorkoutPlan createdWorkoutPlan = workoutPlanService.createWorkoutPlan(workoutPlan);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdWorkoutPlan);
    }

    @PutMapping("/{id}")
    public ResponseEntity<WorkoutPlan> updateWorkoutPlan(@PathVariable Long id, @Valid @RequestBody WorkoutPlan workoutPlan) {
        WorkoutPlan updatedWorkoutPlan = workoutPlanService.updateWorkoutPlan(id, workoutPlan);
        return ResponseEntity.ok(updatedWorkoutPlan);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWorkoutPlan(@PathVariable Long id) {
        workoutPlanService.deleteWorkoutPlan(id);
        return ResponseEntity.noContent().build();
    }
}
