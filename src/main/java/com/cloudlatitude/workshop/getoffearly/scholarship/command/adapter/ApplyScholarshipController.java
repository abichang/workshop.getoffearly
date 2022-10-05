package com.cloudlatitude.workshop.getoffearly.scholarship.command.adapter;

import com.cloudlatitude.workshop.getoffearly.scholarship.command.service.ApplicationForm;
import com.cloudlatitude.workshop.getoffearly.scholarship.command.service.ApplyScholarshipService;
import com.cloudlatitude.workshop.getoffearly.scholarship.command.service.StudentNotExistException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplyScholarshipController {

    private final ApplyScholarshipService applyScholarshipService;

    public ApplyScholarshipController(ApplyScholarshipService applyScholarshipService) {
        this.applyScholarshipService = applyScholarshipService;
    }

    @PostMapping("/scholarship/apply")
    public ResponseEntity<Void> apply(@RequestBody ApplicationForm applicationForm) {
        try {
            applyScholarshipService.apply(applicationForm);
        } catch (StudentNotExistException e) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok().build();
    }
}
