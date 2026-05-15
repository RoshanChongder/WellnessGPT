package com.wellnessgpt_ai.config.groq;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SuppressWarnings("all")
@Configuration
public class ChatClientConfig {

    @Bean(name = "nutritionChatClient")
    public ChatClient nutritionChatClient(
        @Qualifier("nutritionChatModel") ChatModel chatModel
    ) {
        return ChatClient.builder(chatModel).build();
    }

    @Bean(name = "workoutChatClient")
    public ChatClient workoutChatClient(
        @Qualifier("workoutChatModel") ChatModel chatModel
    ) {
        return ChatClient.builder(chatModel).build();
    }
}