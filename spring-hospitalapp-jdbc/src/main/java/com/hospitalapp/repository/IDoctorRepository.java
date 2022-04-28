package com.hospitalapp.repository;

import com.hospitalapp.model.Doctor;

import java.util.List;

public interface IDoctorRepository {
    void addDoctor(Doctor doctor);
    void updateDoctor(int fees, int doctorId);
    void deleteDoctor(int doctorId);

    List<Doctor> findAll();
    List<Doctor> findByDepartment(String department);
    Doctor findById(int id);
    List<Doctor> findByPosition(String doctorPosition);
}
