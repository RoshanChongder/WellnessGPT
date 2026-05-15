package com.wellnessgpt_ai.request.exercise;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@SuppressWarnings("all")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExerciseAnalysisRequest {

    @NotBlank
    private String workoutName;

    @NotBlank
    private String goal;

    @NotEmpty
    private List<ExerciseExercise> exercises;
}