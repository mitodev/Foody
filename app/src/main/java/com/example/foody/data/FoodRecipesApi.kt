package com.example.foody.data

import com.example.foody.models.FoodRecipe
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap

public interface FoodRecipesApi {

    @GET("/recipes/complexSearch")
    fun getRecipes(
        @QueryMap query: Map<String, String>
    ):Response<FoodRecipe>

}