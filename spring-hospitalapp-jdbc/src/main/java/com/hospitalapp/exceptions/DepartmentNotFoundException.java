package com.hospitalapp.exceptions;

public class DepartmentNotFoundException extends RuntimeException {
    public DepartmentNotFoundException() {
    }

    public DepartmentNotFoundException(String message) {
        super(message);
    }
}
