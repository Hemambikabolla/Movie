package com.infy.eventregistration.repository;

import com.infy.eventregistration.entity.Asset;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetRepository extends JpaRepository<Asset, String> {
    // Additional query methods if needed
}
