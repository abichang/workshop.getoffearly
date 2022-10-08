package com.cloudlatitude.workshop.getoffearly;

import lombok.Data;

@Data
public class Application {
    private final long studentId;
    private final long scholarshipId;

    public Application(long studentId, long scholarshipId) {
        this.studentId = studentId;
        this.scholarshipId = scholarshipId;
    }
}
