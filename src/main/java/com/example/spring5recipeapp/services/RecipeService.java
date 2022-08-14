package com.example.spring5recipeapp.services;

import com.example.spring5recipeapp.domain.Recipe;
import java.util.Set;

/**
 * @author Harrison Pan
 */
public interface RecipeService {

  /**
   * find all recipes
   * @return Set<Recipe>
   */
  Set<Recipe> getRecipes();
}
