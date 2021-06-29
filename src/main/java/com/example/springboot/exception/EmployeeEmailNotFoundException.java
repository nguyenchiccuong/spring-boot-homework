package com.example.springboot.exception;

public class EmployeeEmailNotFoundException extends RuntimeException {
    public EmployeeEmailNotFoundException(String email) {
        super("Could not find employee with email = " + email);
    }
}
