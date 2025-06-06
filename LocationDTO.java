package com.infy.eventregistration.dto;

import java.util.List;

import lombok.Data;
@Data
public class LocationDTO {

    private String id;
    private String name;
    private String address;
    private String contactPerson;
    private String permitStatus;
    private double cost;
    private List<String> availability;
    private String notes;

    public LocationDTO() {}

    public LocationDTO(String id, String name, String address, String contactPerson,
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

