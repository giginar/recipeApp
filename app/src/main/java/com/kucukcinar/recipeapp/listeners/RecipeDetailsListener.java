package com.kucukcinar.recipeapp.listeners;

import com.kucukcinar.recipeapp.models.RecipeDetailsResponse;

public interface RecipeDetailsListener {
    void didFetch(RecipeDetailsResponse response, String message);
    void didError(String message);
}
