package com.cloudlatitude.workshop.getoffearly;

public class ApplyScholarshipController {
    private final ScholarshipRepository scholarshipRepository;
    private final StudentRepository studentRepository;

    public ApplyScholarshipController(ScholarshipRepository scholarshipRepository, StudentRepository studentRepository) {

        this.scholarshipRepository = scholarshipRepository;
        this.studentRepository = studentRepository;
    }

    public void apply(ApplicationForm applicationForm) {
        if (studentRepository.find(applicationForm.getStudentId()).isEmpty()) {
            return;
        }
        scholarshipRepository.create(new Application(applicationForm.getStudentId(), applicationForm.getScholarshipId()));
    }
}
