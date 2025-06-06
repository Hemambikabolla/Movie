package com.infy.eventregistration.entity;

import lombok.Data;

import jakarta.persistence.*;
import java.time.LocalDateTime;
@Data
@Entity
public class Message {

    @Id
    private String id;

    private String sender;

    private String recipient;

    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime timestamp;

    private boolean isRead;

    private String channel;

    public Message() {}

    public Message(String id, String sender, String recipient, String subject, String content,
                   LocalDateTime timestamp, boolean isRead, String channel) {
        this.id = id;
        this.sender = sender;
        this.recipient = recipient;
        this.subject = subject;
        this.content = content;
        this.timestamp = timestamp;
        this.isRead = isRead;
        this.channel = channel;
    }

    // Getters and setters omitted for brevity
}
