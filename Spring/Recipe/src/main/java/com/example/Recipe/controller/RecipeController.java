package com.example.Recipe.controller;

import org.springframework.ui.Model;
import com.example.Recipe.model.Recipe;
import com.example.Recipe.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/recipes")
public class RecipeController {

    private final RecipeService recipeService;

    @Autowired
    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
    public String getAllRecipes(Model model) {
        model.addAttribute("recipes", recipeService.findAll());
        model.addAttribute("newRecipe", new Recipe());
        return "recipes";
    }


    @PostMapping
    public String addRecipe(Recipe recipe){
        recipeService.addRecipe(recipe);
        return "redirect:/recipes";
    }
}



