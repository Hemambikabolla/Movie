package com.infy.eventregistration.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infy.eventregistration.entity.Message;
import com.infy.eventregistration.exception.ResourceNotFoundException;
import com.infy.eventregistration.repository.MessageRepository;

import java.util.List;

@Service
@Transactional
public class MessageService {

    private final MessageRepository repository;

    public MessageService(MessageRepository repository) {
        this.repository = repository;
    }

    public List<Message> getAllMessages() {
        return repository.findAll();
    }

    public Message getMessageById(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Message not found with id: " + id));
    }

    public Message saveMessage(Message message) {
        return repository.save(message);
    }

    public void deleteMessage(String id) {
        Message message = getMessageById(id);
        repository.delete(message);
    }
}

