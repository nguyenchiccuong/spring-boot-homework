package com.example.springboot.exception;

public class EmployeeEmailExistException extends RuntimeException {

    public EmployeeEmailExistException(String email) {
        super("Email : " + email + " already exists");
    }

}
