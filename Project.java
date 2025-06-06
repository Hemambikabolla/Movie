package com.infy.eventregistration.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
public class Project {
    
    @Id
    private String id;

    private String title;

    private String genre;

    private double budget;

    private String timeline;

    private String status;

    private String createdDate;

    @ElementCollection
    private List<String> teamMembers;

    @Column(length = 1000)
    private String description;

    // Constructors, Getters & Setters
    public Project() {}

    public Project(String id, String title, String genre, double budget, String timeline,
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
