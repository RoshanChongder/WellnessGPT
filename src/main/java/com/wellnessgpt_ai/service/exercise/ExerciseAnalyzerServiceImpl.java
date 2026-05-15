package com.wellnessgpt_ai.service.exercise;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wellnessgpt_ai.model.PromptTemplateName;
import com.wellnessgpt_ai.model.SystemPrompts;
import com.wellnessgpt_ai.prompt.PromptTemplateService;
import com.wellnessgpt_ai.request.exercise.ExerciseAnalysisRequest;
import com.wellnessgpt_ai.request.exercise.WorkoutPlanRequest;
import com.wellnessgpt_ai.response.exercise.ExerciseAnalysisResponse;
import com.wellnessgpt_ai.response.exercise.WorkoutPlanResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Map;

@SuppressWarnings("all")
@Slf4j
@Service
public class ExerciseAnalyzerServiceImpl implements ExerciseAnalyzerService {

    @Autowired
    private PromptTemplateService promptTemplateService;

    @Autowired
    @Qualifier("workoutChatClient")
    private ChatClient exerciseChatClient;

    @Override
    public ExerciseAnalysisResponse analyzeExercise(ExerciseAnalysisRequest request) throws JsonProcessingException {
        log.info("Exercise Analysis Request Came: {}", request);

        Map<String, Object> requestParams = Map.of(
            "workoutName", request.getWorkoutName(),
            "goal", request.getGoal(),
            "exercises", getExerciseJson(request)
        );
        String prompt = promptTemplateService.getPrompt(PromptTemplateName.EXERCISE_ANALYSIS.getFileName(), requestParams);
        log.info("Prompt Generated: \n {}", prompt);

        return exerciseChatClient.prompt()
                .user(prompt)
                .system(SystemPrompts.EXERCISE_ANALYZER.getPrompt())
                .call()
                .entity(ExerciseAnalysisResponse.class);
    }

    private String getExerciseJson(ExerciseAnalysisRequest request) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request.getExercises());
    }

    public WorkoutPlanResponse getWorkoutPlan(WorkoutPlanRequest request) {
        log.info("Workout Plan Request Came: {}", request);

        Map<String, Object> requestParams = Map.of(
            "goal", request.getGoal(),
            "fitnessLevel", request.getFitnessLevel(),
            "workoutDaysPerWeek", request.getWorkoutDaysPerWeek(),
            "workoutType", request.getWorkoutType(),
            "equipmentAvailable", request.getEquipmentAvailable(),
            "healthConditions", request.getHealthConditions()
        );
        String prompt = promptTemplateService.getPrompt(PromptTemplateName.WORKOUT_GENERATION.getFileName(), requestParams);
        log.info("Prompt Generated: \n {}", prompt);

        return exerciseChatClient.prompt()
            .user(prompt)
            .system(SystemPrompts.WORKOUT_GENERATOR.getPrompt())
            .call()
            .entity(WorkoutPlanResponse.class);
    }
}
