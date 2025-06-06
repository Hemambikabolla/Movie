package com.infy.eventregistration.dto;

import lombok.Data;
import java.time.LocalDate;
@Data
public class BudgetItemDTO {

    private String id;
    private String projectId;
    private String category;
    private String description;
    private double budgetAmount;
    private double actualAmount;
    private String status;
    private LocalDate date;

    public BudgetItemDTO() {}

    public BudgetItemDTO(String id, String projectId, String category, String description, double budgetAmount,
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
