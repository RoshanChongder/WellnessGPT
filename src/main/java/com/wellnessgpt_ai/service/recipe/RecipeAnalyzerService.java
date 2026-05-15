package com.wellnessgpt_ai.service.recipe;

import com.wellnessgpt_ai.request.recipe.DietPlanRequest;
import com.wellnessgpt_ai.request.recipe.RecipeAnalysisRequest;
import com.wellnessgpt_ai.response.recipe.DietPlanResponse;
import com.wellnessgpt_ai.response.recipe.RecipeAnalysisResponse;

public interface RecipeAnalyzerService {
    RecipeAnalysisResponse analyzeRecipe(RecipeAnalysisRequest request);
    DietPlanResponse getDietPlan(DietPlanRequest request);
}
