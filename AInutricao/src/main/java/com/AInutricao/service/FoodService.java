package com.AInutricao.service;

import com.AInutricao.model.Food;

import java.util.List;

public interface FoodService {
    Food createFood(Food food);
    Food updateFood(Long id, Food food);
    void deleteFood(Long id);
    Food getFoodById(Long id);
    List<Food> getAllFoods();
}
