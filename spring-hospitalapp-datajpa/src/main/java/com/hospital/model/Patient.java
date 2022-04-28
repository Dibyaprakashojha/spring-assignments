package com.hospital.model;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Patient {
    @Id
    @GeneratedValue(generator = "pat_gen",strategy = GenerationType.AUTO)
    @SequenceGenerator(sequenceName = "pat_seq",name = "pat_gen",initialValue = 10,allocationSize = 10)
    private Integer patientId;
    private String patientName;
    private String disease;
    @Enumerated(EnumType.STRING)
    private Department department;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;


    public Patient(String patientName, String disease, Department department) {
        this.patientName = patientName;
        this.disease = disease;
        this.department = department;
    }
}
