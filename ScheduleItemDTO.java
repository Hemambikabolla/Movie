package com.infy.eventregistration.dto;

import java.util.List;


import lombok.Data;
@Data
public class ScheduleItemDTO {

    private String id;
    private String projectId;
    private String date;
    private String time;
    private String scene;
    private String location;
    private List<String> cast;
    private List<String> crew;
    private String notes;
    private String status;

    public ScheduleItemDTO() {}

    public ScheduleItemDTO(String id, String projectId, String date, String time, String scene, String location,
                           List<String> cast, List<String> crew, String notes, String status) {
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
}
