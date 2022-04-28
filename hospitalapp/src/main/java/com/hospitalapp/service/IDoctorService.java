package com.hospitalapp.service;

import com.hospitalapp.model.Doctor;

import java.util.List;

public interface IDoctorService {
    List<Doctor> getAll();
    List<Doctor> getByDepartment(String department);
    Doctor getById(int id);
    List<Doctor> getByPosition(String doctorPosition);
}
