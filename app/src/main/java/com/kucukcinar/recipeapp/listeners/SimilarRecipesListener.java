package com.kucukcinar.recipeapp.listeners;

import com.kucukcinar.recipeapp.models.SimilarRecipeResponse;

import java.util.List;

public interface SimilarRecipesListener {
    void didFetch(List<SimilarRecipeResponse> responses, String message);
    void didError(String message);
}
