package com.example.Movies.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    private String title;
    private String director;
    private int releaseYear;
    private double rating;

}
