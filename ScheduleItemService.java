package com.infy.eventregistration.service;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infy.eventregistration.entity.ScheduleItem;
import com.infy.eventregistration.exception.ResourceNotFoundException;
import com.infy.eventregistration.repository.ScheduleItemRepository;

import java.util.List;

@Service
@Transactional
public class ScheduleItemService {

    private final ScheduleItemRepository repository;

    public ScheduleItemService(ScheduleItemRepository repository) {
        this.repository = repository;
    }

    public List<ScheduleItem> getAllScheduleItems() {
        return repository.findAll();
    }

    public ScheduleItem getScheduleItemById(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Schedule item not found with id: " + id));
    }

    public ScheduleItem saveScheduleItem(ScheduleItem item) {
        return repository.save(item);
    }

    public void deleteScheduleItem(String id) {
        ScheduleItem item = getScheduleItemById(id);
        repository.delete(item);
    }
}
