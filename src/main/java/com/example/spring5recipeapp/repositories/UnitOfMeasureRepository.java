package com.example.spring5recipeapp.repositories;

import com.example.spring5recipeapp.domain.UnitOfMeasure;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Harrison Pan
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

  /**
   * Find UnitOfMeasure by description
   * @param description description
   * @return Optional<UnitOfMeasure>
   */
  Optional<UnitOfMeasure> findByDescription(String description);
}
