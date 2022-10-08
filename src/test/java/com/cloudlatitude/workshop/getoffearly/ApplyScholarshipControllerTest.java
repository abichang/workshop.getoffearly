package com.cloudlatitude.workshop.getoffearly;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class ApplyScholarshipControllerTest {

    private final ScholarshipRepository scholarshipRepository = Mockito.mock(ScholarshipRepository.class);
    private final ApplyScholarshipController controller = new ApplyScholarshipController(scholarshipRepository);

    @Test
    void all_ok() throws Exception {
        when_apply(new ApplicationForm(9528L, 12345L));

        verify(scholarshipRepository, times(1))
                .create(new Application(9528L, 12345L));
    }

    private void when_apply(ApplicationForm applicationForm) {
        controller.apply(applicationForm);
    }
}
