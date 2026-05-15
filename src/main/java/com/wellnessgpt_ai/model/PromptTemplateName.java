package com.wellnessgpt_ai.model;

@SuppressWarnings("all")
public enum PromptTemplateName {

    RECIPE_ANALYSIS("recipe-analysis.st"),
    EXERCISE_ANALYSIS("workout-analysis.st"),
    DIET_GENERATION("diet-generation.st"),
    WORKOUT_GENERATION("workout-generation.st"),

    RECIPE_COMPARISON("recipe-comparison.st"),

    EXERCISE_RECOMMENDATION("exercise-recommendation.st");

    private final String fileName;

    PromptTemplateName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}
