package com.wellnessgpt_ai.response.exercise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkoutDayPlan {
    private String day;
    private String focusArea;
    private Integer estimatedDurationMinutes;
    private List<WorkoutExercisePlan> exercises;
}
