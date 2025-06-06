package com.infy.eventregistration.entity;

import java.util.List;

import lombok.Data;

import jakarta.persistence.*;
@Data
@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private String address;

    private String contactPerson;

    
    private String permitStatus;

    private double cost;

    @ElementCollection
    @CollectionTable(name = "location_availability", joinColumns = @JoinColumn(name = "location_id"))
    @Column(name = "availability")
    private List<String> availability;

    private String notes;

    // Constructors
    public Location() {}

    public Location(String id, String name, String address, String contactPerson,
                    String permitStatus, double cost, List<String> availability, String notes) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contactPerson = contactPerson;
        this.permitStatus = permitStatus;
        this.cost = cost;
        this.availability = availability;
        this.notes = notes;
    }

    // Getters and setters omitted for brevity

    
}
