package com.infy.eventregistration.dto;

import java.util.List;

import lombok.Data;
@Data
public class ProjectDTO {
    private String id;
    private String title;
    private String genre;
    private double budget;
    private String timeline;
    private String status;
    private String createdDate;
    private List<String> teamMembers;
    private String description;

    // Constructors
    public ProjectDTO() {}

    public ProjectDTO(String id, String title, String genre, double budget, String timeline,
                      String status, String createdDate, List<String> teamMembers, String description) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.budget = budget;
        this.timeline = timeline;
        this.status = status;
        this.createdDate = createdDate;
        this.teamMembers = teamMembers;
        this.description = description;
    }

    // Getters and Setters omitted for brevity
}
