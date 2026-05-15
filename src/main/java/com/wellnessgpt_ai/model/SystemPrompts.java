package com.wellnessgpt_ai.model;

@SuppressWarnings("all")
public enum SystemPrompts {

    RECIPE_ANALYZER("You are an expert AI nutritionist and wellness assistant."),
    EXERCISE_ANALYZER("You are an expert AI workout and fitness assistant."),
    DIET_PLANNER("You are an expert AI diet planner specializing in personalized meal recommendations."),
    WORKOUT_GENERATOR("You are an expert AI fitness coach specialized in workout planning and exercise recommendations."),

    RECIPE_COMPARATOR("You are an AI nutrition expert specialized in comparing recipes and identifying healthier options."),
    WELLNESS_ASSISTANT("You are a professional AI wellness assistant focused on nutrition, fitness, and healthy lifestyle guidance.");

    private final String prompt;

    SystemPrompts(String prompt) {
        this.prompt = prompt;
    }

    public String getPrompt() {
        return prompt;
    }
}
