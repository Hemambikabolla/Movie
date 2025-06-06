package com.infy.eventregistration.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infy.eventregistration.entity.CastCrewMember;
import com.infy.eventregistration.exception.ResourceNotFoundException;
import com.infy.eventregistration.repository.CastCrewMemberRepository;

import java.util.List;

@Service
@Transactional
public class CastCrewMemberService {

    private final CastCrewMemberRepository repository;

    public CastCrewMemberService(CastCrewMemberRepository repository) {
        this.repository = repository;
    }

    public List<CastCrewMember> getAllMembers() {
        return repository.findAll();
    }

    public CastCrewMember getMemberById(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("CastCrewMember not found with id: " + id));
    }

    public CastCrewMember saveMember(CastCrewMember member) {
        return repository.save(member);
    }

    public void deleteMember(String id) {
        CastCrewMember member = getMemberById(id);
        repository.delete(member);
    }
}
