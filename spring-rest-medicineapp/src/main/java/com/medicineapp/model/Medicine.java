package com.medicineapp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Medicine {
    @Id
    @GeneratedValue(generator = "med_gen",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "med_gen",sequenceName = "med_seq",initialValue = 10,allocationSize = 1)
    @ToString.Exclude
    Integer medicineId;
    @Column(length = 40)
    String medicineName;
    @Column(length = 40)
    String brand;
    @Column(length = 40)
    String category; //-->Personal Care,Ayurvedic Care,Fitness,Diabetic Care,Covid Essentials,Pet care,Baby Care
    @Column(length = 40)
    String cityOfOrigin;
    double price;
    @Column(length = 40)
    String flavour;// --> Mint,Orange
    LocalDate expiryDate;
    @Column(length = 40)
    String consumeType;// - oral, topical
    @Column(length = 40)
    String packSize;// -->200ml,450ml
    @Column(length = 40)
    String manufacturer;
}
