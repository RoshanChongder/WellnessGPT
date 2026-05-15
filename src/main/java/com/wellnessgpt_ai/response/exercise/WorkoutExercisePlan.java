package com.wellnessgpt_ai.response.exercise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkoutExercisePlan {
    private String exerciseName;
    private Integer sets;
    private String reps;
    private String restTime;
}