package com.infy.eventregistration.repository;

import com.infy.eventregistration.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, String> {
    // Additional query methods if necessary
}
