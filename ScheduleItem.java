package com.infy.eventregistration.entity;

import java.util.List;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
public class ScheduleItem {

    @Id
    private String id;

    private String projectId;

    private String date;  // Consider using LocalDate if possible

    private String time;  // Consider using LocalTime or DateTime if needed

    private String scene;

    private String location;

    @ElementCollection
    @CollectionTable(name = "schedule_cast", joinColumns = @JoinColumn(name = "schedule_item_id"))
    @Column(name = "cast_member")
    private List<String> cast;

    @ElementCollection
    @CollectionTable(name = "schedule_crew", joinColumns = @JoinColumn(name = "schedule_item_id"))
    @Column(name = "crew_member")
    private List<String> crew;

    @Column(columnDefinition = "TEXT")
    private String notes;

    @Enumerated(EnumType.STRING)
    private Status status;

    public ScheduleItem() {}

    public ScheduleItem(String id, String projectId, String date, String time, String scene, String location,
                        List<String> cast, List<String> crew, String notes, Status status) {
        this.id = id;
        this.projectId = projectId;
        this.date = date;
        this.time = time;
        this.scene = scene;
        this.location = location;
        this.cast = cast;
        this.crew = crew;
        this.notes = notes;
        this.status = status;
    }

    // Getters and setters omitted for brevity

    public enum Status {
        SCHEDULED,
        IN_PROGRESS,
        COMPLETED,
        CANCELLED
    }
}
