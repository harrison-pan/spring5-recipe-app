package com.example.spring5recipeapp.controllers;

import com.example.spring5recipeapp.domain.Category;
import com.example.spring5recipeapp.domain.UnitOfMeasure;
import com.example.spring5recipeapp.repositories.CategoryRepository;
import com.example.spring5recipeapp.repositories.UnitOfMeasureRepository;
import java.util.Optional;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Harrison Pan
 */
@Controller
public class IndexController {

  private final Logger logger = org.apache.logging.log4j.LogManager.getLogger(IndexController.class);

  private final CategoryRepository categoryRepository;
  private final UnitOfMeasureRepository unitOfMeasureRepository;

  public IndexController(CategoryRepository categoryRepository,
      UnitOfMeasureRepository unitOfMeasureRepository) {
    this.categoryRepository = categoryRepository;
    this.unitOfMeasureRepository = unitOfMeasureRepository;
  }

  @RequestMapping({"", "/", "/index"})
  public String getIndexPage() {

    Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
    Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

    if (categoryOptional.isEmpty() || unitOfMeasureOptional.isEmpty()) {
      throw new RuntimeException("Test data is not present");
    }

    logger.info("Category Id: {}", categoryOptional.get().getId());
    logger.info("UnitOfMeasure Id: {}", unitOfMeasureOptional.get().getId());

    return "index";
  }
}
