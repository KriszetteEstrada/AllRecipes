package com.example.allrecipes;

import java.util.ArrayList;

public class Recipe extends ArrayList<CharSequence> {

    private String name;
    private String descriptions;
    private String image;
    private String instructions;
    private String ingredients;
    private String rating;

    public Recipe() {
    }

    public Recipe(String name, String descriptions, String image, String instructions, String ingredients, String rating) {
        this.name = name;
        this.descriptions = descriptions;
        this.image = image;
        this.instructions = instructions;
        this.ingredients = ingredients;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}