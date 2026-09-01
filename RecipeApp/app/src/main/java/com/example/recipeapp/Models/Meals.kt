package com.example.recipeapp.Models

data class Meals(
    val idMeal: String,
    val strMeal: String,
    val strCategory:String,
    val strDescription: String,
    val strMealThumb: String,

)
data class MealsResponse(
    val meals: List<Meals>
)