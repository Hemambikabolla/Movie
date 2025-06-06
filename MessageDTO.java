package com.infy.eventregistration.dto;

import lombok.Data;
import java.time.LocalDateTime;
@Data
public class MessageDTO {

    private String id;
    private String sender;
    private String recipient;
    private String subject;
    private String content;
    private LocalDateTime timestamp;
    private boolean isRead;
    private String channel;

    public MessageDTO() {}

    public MessageDTO(String id, String sender, String recipient, String subject, String content,
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

