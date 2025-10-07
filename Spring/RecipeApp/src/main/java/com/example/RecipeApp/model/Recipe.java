package com.example.RecipeApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {

    private String title;
    private String type;
    private List<String> ingredients;
    private List<String> steps;
    private String description;
    private double cookingTime;
}
