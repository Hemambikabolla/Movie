package com.infy.eventregistration.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.infy.eventregistration.entity.BudgetItem;
import com.infy.eventregistration.service.BudgetItemService;

import java.util.List;
@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/budget-items")
public class BudgetItemController {

    private final BudgetItemService service;

    public BudgetItemController(BudgetItemService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<BudgetItem>> getAllBudgetItems() {
        return ResponseEntity.ok(service.getAllBudgetItems());
    }

    @GetMapping("/{id}")
    public ResponseEntity<BudgetItem> getBudgetItemById(@PathVariable String id) {
        return ResponseEntity.ok(service.getBudgetItemById(id));
    }

    @PostMapping
    public ResponseEntity<BudgetItem> createBudgetItem(@RequestBody BudgetItem item) {
        BudgetItem saved = service.saveBudgetItem(item);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BudgetItem> updateBudgetItem(@PathVariable String id, @RequestBody BudgetItem item) {
        item.setId(id);
        BudgetItem updated = service.saveBudgetItem(item);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBudgetItem(@PathVariable String id) {
        service.deleteBudgetItem(id);
        return ResponseEntity.noContent().build();
    }
}
