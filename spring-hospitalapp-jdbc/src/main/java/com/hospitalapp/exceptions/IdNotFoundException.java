package com.hospitalapp.exceptions;

public class IdNotFoundException extends RuntimeException {
    public IdNotFoundException() {
    }

    public IdNotFoundException(String message) {
        super(message);
    }
}
