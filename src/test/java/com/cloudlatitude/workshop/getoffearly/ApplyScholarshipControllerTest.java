package com.cloudlatitude.workshop.getoffearly;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class ApplyScholarshipControllerTest {
    @Test
    void all_ok() throws Exception {
        ScholarshipRepository scholarshipRepository = Mockito.mock(ScholarshipRepository.class);
        ApplyScholarshipController controller = new ApplyScholarshipController(scholarshipRepository);

        controller.apply();

        verify(scholarshipRepository, times(1)).create(new Application(9527L, 12345L));
    }
}
