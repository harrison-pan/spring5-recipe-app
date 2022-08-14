package com.example.spring5recipeapp.controllers;

import com.example.spring5recipeapp.services.RecipeService;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Harrison Pan
 */
@Controller
public class IndexController {

  private final Logger logger = org.apache.logging.log4j.LogManager.getLogger(
      IndexController.class);

  private final RecipeService recipeService;

  public IndexController(RecipeService recipeService) {
    this.recipeService = recipeService;
  }

  @RequestMapping({"", "/", "/index"})
  public String getIndexPage(Model model) {
    logger.debug("Getting index page");
    model.addAttribute("recipes", recipeService.getRecipes());

    return "index";
  }
}
