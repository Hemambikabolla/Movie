package com.infy.eventregistration.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Asset {

    @Id
    private String id;

    private String name;

//    @Enumerated(EnumType.STRING)
    private String type;

//    @Enumerated(EnumType.STRING)
    private String status;

    private String location;

    private String assignedTo;

    private String assignedScene;

    private LocalDate lastMaintenance;

    private LocalDate nextMaintenance;

    @Column(length = 1000)
    private String notes;

    private String barcode;

    // Constructors
    public Asset() {}

    public Asset(String id, String name, String type, String status, String location, String assignedTo,
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

    // Enums for type and status
//    public enum AssetType {
//        PROP, COSTUME, EQUIPMENT
//    }
//
//    public enum AssetStatus {
//        AVAILABLE, CHECKED_OUT, MAINTENANCE, DAMAGED
//    }
}
