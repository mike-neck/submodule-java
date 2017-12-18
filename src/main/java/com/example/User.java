package com.example;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("WeakerAccess")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private long userId;
    private String name;
    private LocalDateTime created;
}
