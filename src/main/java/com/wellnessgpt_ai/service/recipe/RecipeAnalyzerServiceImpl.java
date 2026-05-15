package com.wellnessgpt_ai.service.recipe;

import com.wellnessgpt_ai.model.PromptTemplateName;
import com.wellnessgpt_ai.model.SystemPrompts;
import com.wellnessgpt_ai.prompt.PromptTemplateService;
import com.wellnessgpt_ai.request.recipe.DietPlanRequest;
import com.wellnessgpt_ai.request.recipe.RecipeAnalysisRequest;
import com.wellnessgpt_ai.response.recipe.DietPlanResponse;
import com.wellnessgpt_ai.response.recipe.RecipeAnalysisResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Map;

@Slf4j
@Service
@SuppressWarnings("all")
public class RecipeAnalyzerServiceImpl implements RecipeAnalyzerService {

    @Autowired
    private PromptTemplateService promptTemplateService;

    @Autowired
    @Qualifier("nutritionChatClient")
    private ChatClient nutritionChatClient;

    @Override
    public RecipeAnalysisResponse analyzeRecipe(RecipeAnalysisRequest request) {
        log.info("Recipe Analysis Request Came: {}", request);

        Map<String, Object> requestParams = Map.of(
            "recipeName", request.getRecipeName(),
            "ingredients", request.getIngredients()
        );
        String prompt = promptTemplateService.getPrompt(PromptTemplateName.RECIPE_ANALYSIS.getFileName(), requestParams);
        log.info("Prompt Generated: \n {}", prompt);

        return nutritionChatClient.prompt()
            .user(prompt)
            .system(SystemPrompts.RECIPE_ANALYZER.getPrompt())
            .call()
            .entity(RecipeAnalysisResponse.class);
    }

    @Override
    public DietPlanResponse getDietPlan(DietPlanRequest request) {
        log.info("Get Diet Plan Request Came: {}", request);

        Map<String, Object> requestParams = Map.of(
            "dietPreference", request.getDietPreference(),
            "goal", request.getGoal(),
            "mealsPerDay", request.getMealsPerDay(),
            "restrictions", request.getRestrictions()
        );
        String prompt = promptTemplateService.getPrompt(PromptTemplateName.DIET_GENERATION.getFileName(), requestParams);
        log.info("Prompt Generated: \n {}", prompt);

        return nutritionChatClient.prompt()
                .user(prompt)
                .system(SystemPrompts.DIET_PLANNER.getPrompt())
                .call()
                .entity(DietPlanResponse.class);
    }

}
