package com.example.recipeapp

data class Meals(
    val idMeal: String,
    val strMeal: String,
    val strCategory:String,
    val strDescription: String,
    val strMealThumb: String,

)
data class MealsResponse(
    val categories: List<Categories>
)