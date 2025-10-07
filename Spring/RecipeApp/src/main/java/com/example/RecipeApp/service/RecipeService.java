package com.example.RecipeApp.service;

import com.example.RecipeApp.model.Recipe;
import com.example.RecipeApp.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository repository;

    public Recipe save(Recipe recipe){
        return repository.save(recipe);
    }

    public List<Recipe> findByIngredients(List<String> ingredients, String type){
        return repository.findByIngredients(ingredients, type);
    }

    public List<Recipe> findAll(){
        return repository.findAll();
    }


}
