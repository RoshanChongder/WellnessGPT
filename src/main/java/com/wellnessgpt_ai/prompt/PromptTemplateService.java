package com.wellnessgpt_ai.prompt;

import org.springframework.ai.chat.prompt.Prompt;

import java.util.Map;

@SuppressWarnings("all")
public interface PromptTemplateService {
    String buildStringPrompt(String template, Map<String, Object> values);
    Prompt buildPrompt(String template, Map<String, Object> values);
    String getPrompt(String fileName, Map<String, Object> promptParams);
}
