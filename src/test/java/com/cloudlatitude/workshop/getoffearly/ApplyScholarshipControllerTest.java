package com.cloudlatitude.workshop.getoffearly;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;

import static org.mockito.Mockito.*;

public class ApplyScholarshipControllerTest {

    private final ScholarshipRepository scholarshipRepository = Mockito.mock(ScholarshipRepository.class);
    private final StudentRepository studentRepository = Mockito.mock(StudentRepository.class);
    private final ApplyScholarshipController controller = new ApplyScholarshipController(scholarshipRepository, studentRepository);

    @Test
    void all_ok() throws Exception {
        Mockito.when(studentRepository.find(9528L))
                .thenReturn(Optional.of(new Student()));

        when_apply(new ApplicationForm(9528L, 12345L));

        then_should_create(new Application(9528L, 12345L));
    }

    private void when_apply(ApplicationForm applicationForm) {
        controller.apply(applicationForm);
    }

    private void then_should_create(Application application) {
        verify(scholarshipRepository, times(1))
                .create(application);
    }

    @Test
    void student_NOT_exists() throws Exception {

        given_student_not_exists(9528L);

        when_apply(new ApplicationForm(9528L, 12345L));

        verify(scholarshipRepository, never())
                .create(any(Application.class));
    }

    private void given_student_not_exists(long studentId) {
        Mockito.when(studentRepository.find(studentId))
                .thenReturn(Optional.empty());
    }
}
