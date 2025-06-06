package com.infy.eventregistration.repository;

import com.infy.eventregistration.entity.BudgetItem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BudgetItemRepository extends JpaRepository<BudgetItem, String> {
    // Add custom queries here if needed
}
