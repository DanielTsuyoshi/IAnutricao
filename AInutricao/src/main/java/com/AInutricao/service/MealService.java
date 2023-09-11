package com.AInutricao.service;

import com.AInutricao.model.Meal;

import java.util.List;

public interface MealService {
    Meal createMeal(Meal meal);
    Meal updateMeal(Long id, Meal meal);
    void deleteMeal(Long id);
    Meal getMealById(Long id);
    List<Meal> getAllMeals();
}
