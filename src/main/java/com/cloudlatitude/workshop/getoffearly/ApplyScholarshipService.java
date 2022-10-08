package com.cloudlatitude.workshop.getoffearly;

public class ApplyScholarshipService {
    final ScholarshipRepository scholarshipRepository;
    final StudentRepository studentRepository;

    public ApplyScholarshipService(ScholarshipRepository scholarshipRepository, StudentRepository studentRepository) {
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