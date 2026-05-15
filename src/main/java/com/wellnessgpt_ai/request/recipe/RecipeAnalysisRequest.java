package com.wellnessgpt_ai.request.recipe;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RecipeAnalysisRequest {
    @NotBlank(message = "Recipe name cannot be empty")
    private String recipeName;

    @NotEmpty(message = "Ingredients list cannot be empty")
    private List<@NotBlank(message = "Ingredient cannot be blank") String> ingredients;
}
