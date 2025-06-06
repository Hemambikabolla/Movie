package com.infy.eventregistration.entity;

import lombok.Data;

import jakarta.persistence.*;
import java.time.LocalDate;
@Data
@Entity
public class BudgetItem {

    @Id
    private String id;

    private String projectId;

    private String category;

    @Column(length = 1000)
    private String description;

    private double budgetAmount;

    private double actualAmount;


    private String status;

    private LocalDate date;

    // Constructors
    public BudgetItem() {}

    public BudgetItem(String id, String projectId, String category, String description, double budgetAmount,
                      double actualAmount, String status, LocalDate date) {
        this.id = id;
        this.projectId = projectId;
        this.category = category;
        this.description = description;
        this.budgetAmount = budgetAmount;
        this.actualAmount = actualAmount;
        this.status = status;
        this.date = date;
    }

    // Getters and setters omitted for brevity

    
}
