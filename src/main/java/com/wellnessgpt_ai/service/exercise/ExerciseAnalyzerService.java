package com.wellnessgpt_ai.service.exercise;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.wellnessgpt_ai.request.exercise.ExerciseAnalysisRequest;
import com.wellnessgpt_ai.request.exercise.WorkoutPlanRequest;
import com.wellnessgpt_ai.response.exercise.ExerciseAnalysisResponse;
import com.wellnessgpt_ai.response.exercise.WorkoutPlanResponse;

public interface ExerciseAnalyzerService {
    ExerciseAnalysisResponse analyzeExercise(ExerciseAnalysisRequest request) throws JsonProcessingException;
    WorkoutPlanResponse getWorkoutPlan(WorkoutPlanRequest request);
}
