package com.cloudlatitude.workshop.getoffearly.scholarship.command;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplyScholarshipController {
    @PostMapping("/scholarship/apply")
    public ResponseEntity<Void> apply() {
        return ResponseEntity.ok().build();
    }
}
