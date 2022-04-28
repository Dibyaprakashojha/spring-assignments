package com.hospital.service;

import com.hospital.model.Doctor;

import java.util.List;

public interface IDoctorService {
    Doctor addDoctor(Doctor doctor);
    void updateDoctor(Doctor doctor);
    void deleteDoctor(int doctorId);
    Doctor getById(int id);
    List<Doctor> getAll();


    List<Doctor> getByDepartment(String department);
    List<Doctor> getByDoctorPosition(String doctorPosition);
    List<Doctor> getByFees(double fees);

}
