package com.infy.eventregistration.repository;

import com.infy.eventregistration.entity.Task;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, String> {
    // Add custom queries if needed
}

