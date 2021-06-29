package com.example.springboot.exception;

public class EmployeeIdNotFoundException extends RuntimeException {
    public EmployeeIdNotFoundException(Long id) {
        super("Could not find employee with id = " + id);
    }
}
