package com.wellnessgpt_ai.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.wellnessgpt_ai.request.exercise.ExerciseAnalysisRequest;
import com.wellnessgpt_ai.request.exercise.WorkoutPlanRequest;
import com.wellnessgpt_ai.response.exercise.ExerciseAnalysisResponse;
import com.wellnessgpt_ai.response.exercise.WorkoutPlanResponse;
import com.wellnessgpt_ai.service.exercise.ExerciseAnalyzerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("all")
@RestController
@RequestMapping("/api/exercise")
public class ExerciseController {

    @Autowired
    private ExerciseAnalyzerService exerciseAnalyzerService;

    @PostMapping("/analyze")
    public ExerciseAnalysisResponse analyzeRecipe(
        @Valid @RequestBody ExerciseAnalysisRequest request
    ) throws JsonProcessingException {
        return exerciseAnalyzerService.analyzeExercise(request);
    }

    @PostMapping("/workout-plan")
    public WorkoutPlanResponse getDietPlan(
        @Valid @RequestBody WorkoutPlanRequest request
    ) {
        return exerciseAnalyzerService.getWorkoutPlan(request);
    }

}
