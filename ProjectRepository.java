package com.infy.eventregistration.repository;

import com.infy.eventregistration.entity.Project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, String> {
    // Basic CRUD methods inherited
}
