package com.infy.eventregistration.repository;


import java.util.List;
import java.util.Optional;

public interface GenericRepository<T> {
    List<T> findAll();
    Optional<T> findById(String id);
    T save(T entity);
    void deleteById(String id);
}
