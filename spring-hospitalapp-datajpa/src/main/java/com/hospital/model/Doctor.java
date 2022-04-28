package com.hospital.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
public class Doctor {
    @Id
    @GeneratedValue(generator = "doc_gen",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "doc_gen",sequenceName = "doc_seq",initialValue = 1,allocationSize = 1)
    private Integer doctorId;
    private String doctorName;
    private boolean availability;
    @Enumerated(EnumType.STRING)
    private Position doctorPosition;
    private double fees;
    @Enumerated(EnumType.STRING)
    private Department department;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "doctor_id")
    private Set<Patient> patients;


    public Doctor(String doctorName, boolean availability, Position doctorPosition, double fees, Department department, Set<Patient> patients) {
        this.doctorName = doctorName;
        this.availability = availability;
        this.doctorPosition = doctorPosition;
        this.fees = fees;
        this.department = department;
        this.patients = patients;
    }
}
