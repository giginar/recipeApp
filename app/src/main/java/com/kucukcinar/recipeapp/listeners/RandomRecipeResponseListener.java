package com.kucukcinar.recipeapp.listeners;

import com.kucukcinar.recipeapp.models.RandomRecipeApiResponse;

public interface RandomRecipeResponseListener {
    void didFetch(RandomRecipeApiResponse response, String message);
    void didError(String message);
}
