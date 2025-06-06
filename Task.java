package com.infy.eventregistration.entity;

import java.util.List;


import jakarta.persistence.Entity;
import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
public class Task {

    @Id
    private String id;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String assignedTo;

    @Enumerated(EnumType.STRING)
    private Priority priority;

    @Enumerated(EnumType.STRING)
    private Status status;

    private String dueDate; // Can also be LocalDate depending on use-case

    private String projectId;

    @ElementCollection
    @CollectionTable(name = "task_dependencies", joinColumns = @JoinColumn(name = "task_id"))
    @Column(name = "dependency_id")
    private List<String> dependencies;

    public Task() {}

    public Task(String id, String title, String description, String assignedTo, Priority priority,
                Status status, String dueDate, String projectId, List<String> dependencies) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.assignedTo = assignedTo;
        this.priority = priority;
        this.status = status;
        this.dueDate = dueDate;
        this.projectId = projectId;
        this.dependencies = dependencies;
    }

    // Getters and setters omitted for brevity

    public enum Priority {
        LOW, MEDIUM, HIGH
    }

    public enum Status {
        TODO, IN_PROGRESS, COMPLETED
    }
}
