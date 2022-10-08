package com.cloudlatitude.workshop.getoffearly;

import java.util.Optional;

public interface StudentRepository {
    Optional<Student> find(long studentId);
}
