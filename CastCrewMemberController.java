package com.infy.eventregistration.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.infy.eventregistration.entity.CastCrewMember;
import com.infy.eventregistration.service.CastCrewMemberService;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/cast-crew")
public class CastCrewMemberController {

    private final CastCrewMemberService service;

    public CastCrewMemberController(CastCrewMemberService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<CastCrewMember>> getAllMembers() {
        return ResponseEntity.ok(service.getAllMembers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CastCrewMember> getMemberById(@PathVariable String id) {
        return ResponseEntity.ok(service.getMemberById(id));
    }

    @PostMapping
    public ResponseEntity<CastCrewMember> createMember(@RequestBody CastCrewMember member) {
        CastCrewMember saved = service.saveMember(member);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CastCrewMember> updateMember(@PathVariable String id, @RequestBody CastCrewMember member) {
        member.setId(id);
        CastCrewMember updated = service.saveMember(member);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMember(@PathVariable String id) {
        service.deleteMember(id);
        return ResponseEntity.noContent().build();
    }
}
