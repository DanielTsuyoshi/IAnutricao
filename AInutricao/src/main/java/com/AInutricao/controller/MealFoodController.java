package com.AInutricao.controller;

import com.AInutricao.model.MealFood;
import com.AInutricao.service.MealFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/mealfoods")
public class MealFoodController {

    @Autowired
    private MealFoodService mealFoodService;

    @GetMapping
    public ResponseEntity<List<MealFood>> getAllMealFoods() {
        List<MealFood> mealFoods = mealFoodService.getAllMealFoods();
        return ResponseEntity.ok(mealFoods);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MealFood> getMealFoodById(@PathVariable Long id) {
        MealFood mealFood = mealFoodService.getMealFoodById(id);
        return ResponseEntity.ok(mealFood);
    }

    @PostMapping
    public ResponseEntity<MealFood> createMealFood(@Valid @RequestBody MealFood mealFood) {
        MealFood createdMealFood = mealFoodService.createMealFood(mealFood);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdMealFood);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MealFood> updateMealFood(@PathVariable Long id, @Valid @RequestBody MealFood mealFood) {
        MealFood updatedMealFood = mealFoodService.updateMealFood(id, mealFood);
        return ResponseEntity.ok(updatedMealFood);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMealFood(@PathVariable Long id) {
        mealFoodService.deleteMealFood(id);
        return ResponseEntity.noContent().build();
    }
}