package com.hospitalapp.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Doctor {
    private Integer doctorId;
    private String doctorName;
    private Department department;
    private boolean availability;
    private Position doctorPosition;
    private Integer fees;

    public Doctor(String doctorName, Department department, boolean availability, Position doctorPosition, Integer fees) {
        this.doctorName = doctorName;
        this.department = department;
        this.availability = availability;
        this.doctorPosition = doctorPosition;
        this.fees = fees;
    }
}
