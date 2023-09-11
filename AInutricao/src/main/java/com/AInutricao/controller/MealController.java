package com.AInutricao.controller;

import com.AInutricao.model.Meal;
import com.AInutricao.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/meals")
public class MealController {

    @Autowired
    private MealService mealService;

    @GetMapping
    public ResponseEntity<List<Meal>> getAllMeals() {
        List<Meal> meals = mealService.getAllMeals();
        return ResponseEntity.ok(meals);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Meal> getMealById(@PathVariable Long id) {
        Meal meal = mealService.getMealById(id);
        return ResponseEntity.ok(meal);
    }

    @PostMapping
    public ResponseEntity<Meal> createMeal(@Valid @RequestBody Meal meal) {
        Meal createdMeal = mealService.createMeal(meal);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdMeal);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Meal> updateMeal(@PathVariable Long id, @Valid @RequestBody Meal meal) {
        Meal updatedMeal = mealService.updateMeal(id, meal);
        return ResponseEntity.ok(updatedMeal);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMeal(@PathVariable Long id) {
        mealService.deleteMeal(id);
        return ResponseEntity.noContent().build();
    }
}