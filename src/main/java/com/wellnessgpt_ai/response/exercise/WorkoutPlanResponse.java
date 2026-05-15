package com.wellnessgpt_ai.response.exercise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@SuppressWarnings("all")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkoutPlanResponse {
    private String goal;
    private String fitnessLevel;
    private Integer workoutDaysPerWeek;
    private List<WorkoutDayPlan> weeklyPlan;
    private List<String> recommendations;
    private String summary;
}
