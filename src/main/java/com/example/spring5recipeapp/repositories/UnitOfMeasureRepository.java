package com.example.spring5recipeapp.repositories;

import com.example.spring5recipeapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Harrison Pan
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
