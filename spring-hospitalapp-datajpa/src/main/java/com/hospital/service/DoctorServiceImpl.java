package com.hospital.service;

import com.hospital.model.Doctor;
import com.hospital.repository.IDoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Doctor addDoctor(Doctor doctor) {
        return iDoctorRepository.save(doctor);
    }

    @Override
    public void updateDoctor(Doctor doctor) {
        iDoctorRepository.save(doctor);
    }

    @Override
    public void deleteDoctor(int doctorId) {
        iDoctorRepository.deleteById(doctorId);
    }

    @Override
    public Doctor getById(int id) {
        return iDoctorRepository.findById(id).get();
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
    public List<Doctor> getByDoctorPosition(String doctorPosition) {
        return iDoctorRepository.findByDoctorPosition(doctorPosition);
    }

    @Override
    public List<Doctor> getByFees(double fees) {
        return iDoctorRepository.findByFees(fees);
    }
}
