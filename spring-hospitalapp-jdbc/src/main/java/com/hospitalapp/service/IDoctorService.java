package com.hospitalapp.service;

import com.hospitalapp.exceptions.DepartmentNotFoundException;
import com.hospitalapp.exceptions.DoctorNotFoundException;
import com.hospitalapp.exceptions.IdNotFoundException;
import com.hospitalapp.exceptions.PositionNotFoundException;
import com.hospitalapp.model.Doctor;

import java.util.List;

public interface IDoctorService {
    void addDoctor(Doctor doctor);
    void updateDoctor(int fees, int doctorId);
    void deleteDoctor(int doctorId);

    List<Doctor> getAll() throws DoctorNotFoundException;
    List<Doctor> getByDepartment(String department) throws DepartmentNotFoundException;
    Doctor getById(int id) throws IdNotFoundException;
    List<Doctor> getByPosition(String doctorPosition) throws PositionNotFoundException;
}
