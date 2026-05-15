package com.wellnessgpt_ai.request.recipe;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("all")
public class DietPlanRequest {

    @NotBlank(message = "Goal cannot be empty")
    private String goal;

    @NotBlank(message = "Diet preference cannot be empty")
    private String dietPreference;

    @NotNull(message = "Meals per day is required")
    @Min(value = 1, message = "Meals per day must be at least 1")
    @Max(value = 10, message = "Meals per day cannot exceed 10")
    private Integer mealsPerDay;

    private String restrictions;
}
