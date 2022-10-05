package com.cloudlatitude.workshop.getoffearly.scholarship.command.service;

public class StudentNotExistException extends Exception {
    public StudentNotExistException(String message) {
        super(message);
    }
}
