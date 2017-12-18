package com.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

import org.jetbrains.annotations.NotNull;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

public class JsonConfig implements Supplier<ObjectMapper> {

    @NotNull
    @Override
    public ObjectMapper get() {
        final SimpleModule module = new SimpleModule();
        module.addSerializer(
                LocalDateTime.class,
                new LocalDateTimeSerializer(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        module.addDeserializer(
                LocalDateTime.class,
                new LocalDateTimeDeserializer(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        return new ObjectMapper()
                .setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE)
                .registerModule(module);
    }
}
