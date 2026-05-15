package com.wellnessgpt_ai.controller;

import com.wellnessgpt_ai.request.recipe.DietPlanRequest;
import com.wellnessgpt_ai.request.recipe.RecipeAnalysisRequest;
import com.wellnessgpt_ai.response.recipe.DietPlanResponse;
import com.wellnessgpt_ai.response.recipe.RecipeAnalysisResponse;
import com.wellnessgpt_ai.service.recipe.RecipeAnalyzerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/recipes")
public class RecipeController {

    @Autowired
    private RecipeAnalyzerService recipeService;

    @PostMapping("/analyze")
    public RecipeAnalysisResponse analyzeRecipe(@RequestBody RecipeAnalysisRequest request) {
        return recipeService.analyzeRecipe(request);
    }

    @PostMapping("/diet")
    public DietPlanResponse getDietPlan(@RequestBody DietPlanRequest request) {
        return recipeService.getDietPlan(request);
    }

}
