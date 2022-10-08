package com.cloudlatitude.workshop.getoffearly;

import lombok.Data;

@Data
public class ApplicationForm {
    private final long studentId;
    private final long scholarshipId;

    public ApplicationForm(long studentId, long scholarshipId) {
        this.studentId = studentId;
        this.scholarshipId = scholarshipId;
    }
}
