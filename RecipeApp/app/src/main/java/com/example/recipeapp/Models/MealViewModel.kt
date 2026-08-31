package com.example.recipeapp.Models

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.recipeapp.Categories

class MealViewModel: ViewModel() {
    private val categories= MutableLiveData<List<Categories>>()
}