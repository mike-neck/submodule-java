package com.example;

import java.util.function.Supplier;

import org.jetbrains.annotations.NotNull;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class JsonConfig implements Supplier<ObjectMapper> {

    @NotNull
    @Override
    public ObjectMapper get() {
        final ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper.registerModule(new JavaTimeModule());
    }
}
