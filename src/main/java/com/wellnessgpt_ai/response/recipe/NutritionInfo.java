package com.wellnessgpt_ai.response.recipe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NutritionInfo {
    private Integer estimatedCalories;
    private String protein;
    private String carbohydrates;
    private String fat;
    private Double healthScore;
}
