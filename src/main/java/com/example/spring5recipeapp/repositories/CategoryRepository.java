package com.example.spring5recipeapp.repositories;

import com.example.spring5recipeapp.domain.Category;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Harrison Pan
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

  /**
   * find Category by description
   * @param description description
   * @return Optional<Category>
   */
  Optional<Category> findByDescription(String description);
}
