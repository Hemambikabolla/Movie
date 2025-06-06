package com.infy.eventregistration.repository;

import com.infy.eventregistration.entity.ScheduleItem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleItemRepository extends JpaRepository<ScheduleItem, String> {
    // Custom queries if needed
}

