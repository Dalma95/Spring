package com.example.Recipe.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {
    private String title;
    private List<String> ingredients;
    private String description;
    private List<String> preparationSteps;
    private double cookingTime; // in minutes

}
