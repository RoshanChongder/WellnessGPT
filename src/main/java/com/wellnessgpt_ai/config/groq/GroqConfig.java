package com.wellnessgpt_ai.config.groq;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.ai.openai.OpenAiChatOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ai.openai.api.OpenAiApi;

@SuppressWarnings("all")
@Configuration
public class GroqConfig {

    @Value("${spring.ai.openai.base-url:https://api.groq.com/openai}")
    private String baseUrl;

    @Value("${spring.ai.openai.api-key}")
    private String apiKey;

    @Value("${ai.models.nutrition.model:llama-3.1-8b-instant}")
    private String nutritionModel;

    @Value("${ai.models.nutrition.temperature:0.3}")
    private Double nutritionTemperature;

    @Value("${ai.models.workout.model:llama-3.1-8b-instant}")
    private String workoutModel;

    @Value("${ai.models.workout.temperature:0.7}")
    private Double workoutTemperature;


    @Bean
    public OpenAiApi openAiApi() {
        return OpenAiApi.builder()
                .baseUrl(baseUrl)
                .apiKey(apiKey)
                .build();
    }

    @Bean(name = "nutritionChatModel")
    public ChatModel nutritionChatModel(OpenAiApi openAiApi) {
        return OpenAiChatModel.builder()
                .openAiApi(openAiApi)
                .defaultOptions(
                        OpenAiChatOptions.builder()
                                .model(nutritionModel)
                                .temperature(nutritionTemperature)
                                .build()
                ).build();
    }

    @Bean(name = "workoutChatModel")
    public ChatModel workoutChatModel(OpenAiApi openAiApi) {
        return OpenAiChatModel.builder()
                .openAiApi(openAiApi)
                .defaultOptions(
                        OpenAiChatOptions.builder()
                                .model(workoutModel)
                                .temperature(workoutTemperature)
                                .build()
                ).build();
    }
}
