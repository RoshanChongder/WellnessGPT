package com.wellnessgpt_ai.response.recipe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecipeAnalysisResponse {
    private String recipeName;
    private NutritionInfo nutritionInfo;
    private String aiInsights;
    private String summary;
}
