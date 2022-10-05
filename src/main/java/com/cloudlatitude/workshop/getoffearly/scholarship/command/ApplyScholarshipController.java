package com.cloudlatitude.workshop.getoffearly.scholarship.command;

import com.cloudlatitude.workshop.getoffearly.scholarship.command.service.ApplyScholarshipService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplyScholarshipController {

    private final ApplyScholarshipService applyScholarshipService;

    public ApplyScholarshipController(ApplyScholarshipService applyScholarshipService) {
        this.applyScholarshipService = applyScholarshipService;
    }

    @PostMapping("/scholarship/apply")
    public ResponseEntity<Void> apply() {
        applyScholarshipService.apply(new ApplicationForm(9527L, 55688L));
        return ResponseEntity.ok().build();
    }
}
