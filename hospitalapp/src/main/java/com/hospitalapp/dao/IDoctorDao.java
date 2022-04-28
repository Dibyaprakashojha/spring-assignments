package com.hospitalapp.dao;

import com.hospitalapp.model.Doctor;

import java.util.List;

public interface IDoctorDao {
    List<Doctor> findAll();
    List<Doctor> findByDepartment(String department);
    Doctor findById(int id);
    List<Doctor> findByPosition(String doctorPosition);
}
