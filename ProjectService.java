package com.infy.eventregistration.service;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infy.eventregistration.entity.Project;
import com.infy.eventregistration.exception.ResourceNotFoundException;
import com.infy.eventregistration.repository.ProjectRepository;

import java.util.List;

@Service
@Transactional
public class ProjectService {

    private final ProjectRepository repository;

    public ProjectService(ProjectRepository repository) {
        this.repository = repository;
    }

    public List<Project> getAllProjects() {
        return repository.findAll();
    }

    public Project getProjectById(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Project not found with id: " + id));
    }

    public Project saveProject(Project project) {
        return repository.save(project);
    }

    public void deleteProject(String id) {
        Project project = getProjectById(id);
        repository.delete(project);
    }
}
