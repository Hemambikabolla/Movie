package com.infy.eventregistration.api;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.infy.eventregistration.entity.ScheduleItem;
import com.infy.eventregistration.service.ScheduleItemService;

import java.util.List;

@RestController
@RequestMapping("/api/scheduleItems")
public class ScheduleItemController {

    private final ScheduleItemService service;

    public ScheduleItemController(ScheduleItemService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<ScheduleItem>> getAllScheduleItems() {
        return ResponseEntity.ok(service.getAllScheduleItems());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ScheduleItem> getScheduleItemById(@PathVariable String id) {
        return ResponseEntity.ok(service.getScheduleItemById(id));
    }

    @PostMapping
    public ResponseEntity<ScheduleItem> createScheduleItem(@RequestBody ScheduleItem item) {
        ScheduleItem saved = service.saveScheduleItem(item);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ScheduleItem> updateScheduleItem(@PathVariable String id, @RequestBody ScheduleItem item) {
        item.setId(id);
        ScheduleItem updated = service.saveScheduleItem(item);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteScheduleItem(@PathVariable String id) {
        service.deleteScheduleItem(id);
        return ResponseEntity.noContent().build();
    }
}

