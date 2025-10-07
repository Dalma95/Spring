package com.example.RecipeApp.controller;

import com.example.RecipeApp.model.Recipe;
import com.example.RecipeApp.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/recipes")
public class RecipeController {

    @Autowired
    private RecipeService service;

    @PostMapping
    public ResponseEntity<Recipe> saveRecipe(@RequestBody Recipe recipe){
        return ResponseEntity.ok(service.save(recipe));
    }

    @GetMapping
    public ResponseEntity<List<Recipe>> getAllRecipes(){
        List<Recipe> allRecipes = service.findAll();
        if (allRecipes.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(allRecipes);
    }


    @GetMapping("/{ingredients}/{type}")
    public ResponseEntity<List<Recipe>> getRecipesByIngredients(@PathVariable List<String> ingredients, @PathVariable String type){
        List<Recipe> result = service.findByIngredients(ingredients,type);
        if(result.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(result);
    }


}
