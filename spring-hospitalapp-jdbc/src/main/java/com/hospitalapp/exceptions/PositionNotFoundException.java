package com.hospitalapp.exceptions;

public class PositionNotFoundException extends RuntimeException {
    public PositionNotFoundException() {
    }

    public PositionNotFoundException(String message) {
        super(message);
    }
}
