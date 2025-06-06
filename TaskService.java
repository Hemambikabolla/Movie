package com.infy.eventregistration.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infy.eventregistration.entity.Task;
import com.infy.eventregistration.exception.ResourceNotFoundException;
import com.infy.eventregistration.repository.TaskRepository;

import java.util.List;

@Service
@Transactional
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    public Task getTaskById(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Task not found with id: " + id));
    }

    public Task saveTask(Task task) {
        return repository.save(task);
    }

    public void deleteTask(String id) {
        Task task = getTaskById(id);
        repository.delete(task);
    }
}
