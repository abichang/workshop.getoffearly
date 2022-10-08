package com.cloudlatitude.workshop.getoffearly;

public class ApplyScholarshipController {
    private final ApplyScholarshipService applyScholarshipService;

    public ApplyScholarshipController(ScholarshipRepository scholarshipRepository, StudentRepository studentRepository) {

        applyScholarshipService = new ApplyScholarshipService(scholarshipRepository, studentRepository);
    }

    public void apply(ApplicationForm applicationForm) {
        applyScholarshipService.apply(applicationForm);
    }
}
