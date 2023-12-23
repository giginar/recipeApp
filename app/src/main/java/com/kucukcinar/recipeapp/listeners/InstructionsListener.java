package com.kucukcinar.recipeapp.listeners;

import com.kucukcinar.recipeapp.models.InstructionsResponse;

import java.util.List;

public interface InstructionsListener {
    void didFetch(List<InstructionsResponse> response, String message);
    void didError(String message);
}
