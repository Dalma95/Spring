package com.example.RecipeApp.repository;

import com.example.RecipeApp.model.Recipe;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class RecipeRepository {

    private final Map<String, Recipe> recipes = new HashMap<>();

    public Recipe save(Recipe recipe){
        recipes.put(recipe.getTitle(),recipe);
        return recipe;
    }

    public List<Recipe> findByIngredients(List<String> ingredients, String type){
        return recipes.values().stream()
                .filter(recipe -> new HashSet<>(recipe.getIngredients()).containsAll(ingredients))
                .filter(recipe -> recipe.getType().equalsIgnoreCase(type))
                .toList();
    }

    public List<Recipe> findAll(){
        return new ArrayList<>(recipes.values());
    }
}
