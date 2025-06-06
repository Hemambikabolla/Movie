package com.infy.eventregistration.repository;

import com.infy.eventregistration.entity.CastCrewMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CastCrewMemberRepository extends JpaRepository<CastCrewMember, String> {
    // Add custom queries if needed
}
