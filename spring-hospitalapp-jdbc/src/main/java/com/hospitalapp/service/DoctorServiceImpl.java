package com.hospitalapp.service;

import com.hospitalapp.repository.IDoctorRepository;
import com.hospitalapp.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DoctorServiceImpl implements IDoctorService{
    IDoctorRepository iDoctorRepository;
    @Autowired
    public DoctorServiceImpl(IDoctorRepository iDoctorRepository) {
        this.iDoctorRepository = iDoctorRepository;
    }


    @Override
    public void addDoctor(Doctor doctor) {
        iDoctorRepository.addDoctor(doctor);
    }

    @Override
    public void updateDoctor(int fees, int doctorId) {
        iDoctorRepository.updateDoctor(fees,doctorId);
    }

    @Override
    public void deleteDoctor(int doctorId) {
        iDoctorRepository.deleteDoctor(doctorId);
    }

    @Override
    public List<Doctor> getAll() {
        return iDoctorRepository.findAll();
    }

    @Override
    public List<Doctor> getByDepartment(String department) {
        return iDoctorRepository.findByDepartment(department);
    }

    @Override
    public Doctor getById(int id) {
        return iDoctorRepository.findById(id);
    }

    @Override
    public List<Doctor> getByPosition(String doctorPosition) {
        return iDoctorRepository.findByPosition(doctorPosition);
    }
}
