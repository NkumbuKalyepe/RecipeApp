package com.example.recipeapp.Network

import com.example.recipeapp.Models.CategoriesResponse
import com.example.recipeapp.Models.MealsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MealDBAPIService{
    @GET("search.php")
    suspend fun searchMeals(@Query("s") query:String): MealsResponse
    @GET("categories.php")
    suspend fun getCategories(): CategoriesResponse
    @GET("lookup.php")
    suspend fun getMealById(@Query("i") id:String): MealsResponse
}