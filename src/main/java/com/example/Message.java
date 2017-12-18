package com.example;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    private Long messageId;
    private String username;
    private String text;
    private LocalDateTime created;
}
