package com.wellnessgpt_ai.request.exercise;

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
public class WorkoutPlanRequest {

    @NotBlank(message = "Goal cannot be empty")
    private String goal;

    @NotBlank(message = "Fitness level cannot be empty")
    private String fitnessLevel;

    @NotNull(message = "Workout days per week is required")
    @Min(value = 1, message = "Workout days must be at least 1")
    @Max(value = 7, message = "Workout days cannot exceed 7")
    private Integer workoutDaysPerWeek;

    @NotBlank(message = "Workout type cannot be empty")
    private String workoutType;

    private String equipmentAvailable;

    private String healthConditions;
}
