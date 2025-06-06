package com.infy.eventregistration.dto;


import lombok.Data;
import java.time.LocalDate;
@Data
public class AssetDTO {

    private String id;
    private String name;
    private String type;   // Store enum as String
    private String status; // Store enum as String
    private String location;
    private String assignedTo;
    private String assignedScene;
    private LocalDate lastMaintenance;
    private LocalDate nextMaintenance;
    private String notes;
    private String barcode;

    public AssetDTO() {}

    public AssetDTO(String id, String name, String type, String status, String location, String assignedTo,
                    String assignedScene, LocalDate lastMaintenance, LocalDate nextMaintenance, String notes, String barcode) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.status = status;
        this.location = location;
        this.assignedTo = assignedTo;
        this.assignedScene = assignedScene;
        this.lastMaintenance = lastMaintenance;
        this.nextMaintenance = nextMaintenance;
        this.notes = notes;
        this.barcode = barcode;
    }

    // Getters and setters omitted for brevity
}
