package com.example.spring5recipeapp.repositories;

import com.example.spring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Harrison Pan
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
