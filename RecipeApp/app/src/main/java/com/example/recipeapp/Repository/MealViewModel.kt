package com.example.recipeapp.Repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.recipeapp.Models.Categories
import com.example.recipeapp.Models.Meals
import kotlinx.coroutines.launch

class MealViewModel: ViewModel() {
    private val repo = MealRepo()
    private val _categories= MutableLiveData<List<Categories>>()
    val categories: LiveData<List<Categories>> =_categories
    private val _meals=MutableLiveData<List<Meals>>()
    val meals: LiveData<List<Meals>> = _meals


    fun fetchCategoties()
    {
        viewModelScope.launch {
            try{
                _categories.value=repo.getCategories().categories
            }
            catch (e: Exception) {e.printStackTrace()}
        }
    }

    fun searchMeals(query: String){
        viewModelScope.launch {
            try{
                _meals.value = repo.searchMeals(query).meals
            }catch (e: Exception) {e.printStackTrace()}
        }
    }
}