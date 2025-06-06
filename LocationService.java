package com.infy.eventregistration.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infy.eventregistration.entity.Location;
import com.infy.eventregistration.exception.ResourceNotFoundException;
import com.infy.eventregistration.repository.LocationRepository;

import java.util.List;

@Service
@Transactional
public class LocationService {

    private final LocationRepository repository;

    public LocationService(LocationRepository repository) {
        this.repository = repository;
    }

    public List<Location> getAllLocations() {
        return repository.findAll();
    }

    public Location getLocationById(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Location not found with id: " + id));
    }

    public Location saveLocation(Location location) {
        return repository.save(location);
    }

    public void deleteLocation(String id) {
        Location location = getLocationById(id);
        repository.delete(location);
    }
}
