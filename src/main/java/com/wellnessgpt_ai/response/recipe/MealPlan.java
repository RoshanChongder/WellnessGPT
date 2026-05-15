package com.wellnessgpt_ai.response.recipe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MealPlan {
    private String mealTime;
    private String mealName;
    private Integer calories;
    private String protein;
    private String carbohydrates;
    private String fat;
}
