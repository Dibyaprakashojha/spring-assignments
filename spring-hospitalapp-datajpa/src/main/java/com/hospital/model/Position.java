package com.hospital.model;

public enum Position {
    SURGEON("SURGEON"),
    HSURGEON("HOUSE SURGEON"),
    SPECIALIST("SPECIALIST"),
    SSPECIALIST("SUPER SPECIALIST"),
    JUNIOR("JUNIOR DOCTOR"),
    INTERN("INTERN");

    public String position;

    Position(String position) {
        this.position = position;
    }
}
