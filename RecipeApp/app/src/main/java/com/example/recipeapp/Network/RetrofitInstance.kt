package com.example.recipeapp.Network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private val BASEURL= "www.themealdb.com/api/json/v1/1/"

    val apiService: MealDBAPIService by lazy{
        Retrofit.Builder().baseUrl(BASEURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(MealDBAPIService::class.java)
    }
}