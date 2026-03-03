package com.example.smartjobportal.controller;

import com.example.smartjobportal.entity.Application;
import com.example.smartjobportal.service.ApplicationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/applications")
public class ApplicationController {

    private final ApplicationService service;

    public ApplicationController(ApplicationService service) {
        this.service = service;
    }

    @PostMapping
    public Application apply(@RequestBody Application application) {
        return service.applyJob(application);
    }

    @GetMapping
    public List<Application> getAll() {
        return service.getAllApplications();
    }
}