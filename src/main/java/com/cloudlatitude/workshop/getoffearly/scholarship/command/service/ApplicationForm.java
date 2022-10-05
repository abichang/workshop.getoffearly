package com.cloudlatitude.workshop.getoffearly.scholarship.command.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationForm {
    private long studentId;
    private long scholarshipId;
}
