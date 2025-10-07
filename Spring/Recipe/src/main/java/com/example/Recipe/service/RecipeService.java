package com.example.Recipe.service;

import com.example.Recipe.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecipeService {

    private List<Recipe> recipes = new ArrayList<>();

    public void addRecipe(Recipe recipe){
        recipes.add(recipe);
    }

    public List<Recipe> findAll(){
        return recipes;
    }

}
