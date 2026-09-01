package com.example.recipeapp.Repository

import com.example.recipeapp.Network.RetrofitInstance

class MealRepo {
    suspend fun searchMeals(query: String) = RetrofitInstance.apiService.searchMeals(query)
    suspend fun getCategories()= RetrofitInstance.apiService.getCategories()
}