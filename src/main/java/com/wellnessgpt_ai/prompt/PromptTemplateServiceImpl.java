package com.wellnessgpt_ai.prompt;

import lombok.SneakyThrows;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.nio.file.Files;
import java.util.Map;

@SuppressWarnings("all")
@Service
public class PromptTemplateServiceImpl implements PromptTemplateService {

    @SneakyThrows
    public String loadPromptTemplate(String fileName) {
        ClassPathResource resource = new ClassPathResource("prompts/" + fileName);
        return Files.readString(resource.getFile().toPath());
    }

    public String buildStringPrompt(String template, Map<String, Object> values) {
        PromptTemplate promptTemplate = new PromptTemplate(template);
        return promptTemplate.render(values);
    }

    public Prompt buildPrompt(String template, Map<String, Object> values) {
        PromptTemplate promptTemplate = new PromptTemplate(template);
        return promptTemplate.create(values);
    }

    public String getPrompt(String fileName, Map<String, Object> promptParams) {
        String template = loadPromptTemplate(fileName);
        return buildStringPrompt(template, promptParams);
    }

}
