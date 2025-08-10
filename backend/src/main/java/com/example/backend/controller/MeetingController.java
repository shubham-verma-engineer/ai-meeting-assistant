package com.example.backend.controller;

import com.example.backend.model.Meeting;
import com.example.backend.repo.MeetingRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/meetings")
public class MeetingController {
    private final MeetingRepository repo;
    public MeetingController(MeetingRepository repo){this.repo=repo;}

    @GetMapping
    public List<Meeting> list(){ return repo.findAll(); }

    @PostMapping
    public Meeting create(@RequestBody Meeting m){ return repo.save(m); }
}
