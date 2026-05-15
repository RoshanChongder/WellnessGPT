package com.wellnessgpt_ai.response.recipe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DietPlanResponse {
    private String goal;
    private String dietType;
    private Integer totalEstimatedCalories;
    private List<MealPlan> meals;
    private List<String> tips;
    private String summary;
}