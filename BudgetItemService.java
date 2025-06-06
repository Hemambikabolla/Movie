package com.infy.eventregistration.service;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infy.eventregistration.entity.BudgetItem;
import com.infy.eventregistration.exception.ResourceNotFoundException;
import com.infy.eventregistration.repository.BudgetItemRepository;

import java.util.List;

@Service
@Transactional
public class BudgetItemService {

    private final BudgetItemRepository repository;

    public BudgetItemService(BudgetItemRepository repository) {
        this.repository = repository;
    }

    public List<BudgetItem> getAllBudgetItems() {
        return repository.findAll();
    }

    public BudgetItem getBudgetItemById(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("BudgetItem not found with id: " + id));
    }

    public BudgetItem saveBudgetItem(BudgetItem item) {
        return repository.save(item);
    }

    public void deleteBudgetItem(String id) {
        BudgetItem item = getBudgetItemById(id);
        repository.delete(item);
    }
}
