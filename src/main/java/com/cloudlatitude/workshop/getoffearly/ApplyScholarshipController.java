package com.cloudlatitude.workshop.getoffearly;

public class ApplyScholarshipController {
    private final ApplyScholarshipService applyScholarshipService;

    public ApplyScholarshipController(ApplyScholarshipService applyScholarshipService) {
        this.applyScholarshipService = applyScholarshipService;
    }

    public void apply(ApplicationForm applicationForm) {
        applyScholarshipService.apply(applicationForm);
    }
}
