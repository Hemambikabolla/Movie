package com.infy.eventregistration.repository;

import com.infy.eventregistration.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message, String> {
    // Custom queries if needed
}
