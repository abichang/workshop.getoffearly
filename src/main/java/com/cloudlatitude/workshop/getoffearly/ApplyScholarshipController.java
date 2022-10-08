package com.cloudlatitude.workshop.getoffearly;

public class ApplyScholarshipController {
    private final ScholarshipRepository scholarshipRepository;

    public ApplyScholarshipController(ScholarshipRepository scholarshipRepository) {

        this.scholarshipRepository = scholarshipRepository;
    }

    public void apply(ApplicationForm applicationForm) {
        scholarshipRepository.create(new Application(applicationForm.getStudentId(), applicationForm.getScholarshipId()));
    }
}
