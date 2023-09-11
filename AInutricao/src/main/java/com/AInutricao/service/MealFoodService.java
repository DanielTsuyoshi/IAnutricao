package com.AInutricao.service;

import com.AInutricao.model.MealFood;

import java.util.List;

public interface MealFoodService {
    MealFood createMealFood(MealFood mealFood);
    MealFood updateMealFood(Long id, MealFood mealFood);
    void deleteMealFood(Long id);
    MealFood getMealFoodById(Long id);
    List<MealFood> getAllMealFoods();
}
