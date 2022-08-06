package com.example.spring5recipeapp.repositories;

import com.example.spring5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Harrison Pan
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
