package com.wellnessgpt_ai.response.exercise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@SuppressWarnings("all")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExerciseAnalysisResponse {
    private String workoutName;
    private List<String> targetMuscles;
    private Integer estimatedCaloriesBurn;
    private String intensity;
    private List<String> benefits;
    private List<String> recommendations;
    private String summary;
}