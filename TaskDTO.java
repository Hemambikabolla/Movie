package com.infy.eventregistration.dto;


import java.util.List;
import lombok.Data;
@Data
public class TaskDTO {

    private String id;
    private String title;
    private String description;
    private String assignedTo;
    private String priority;
    private String status;
    private String dueDate;
    private String projectId;
    private List<String> dependencies;

    public TaskDTO() {}

    public TaskDTO(String id, String title, String description, String assignedTo, String priority,
                   String status, String dueDate, String projectId, List<String> dependencies) {
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
}
