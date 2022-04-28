package com.hospitalapp.service;

import com.hospitalapp.dao.IDoctorDao;
import com.hospitalapp.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class DoctorServiceImpl implements IDoctorService{
    IDoctorDao iDoctorDao;
    @Autowired
    public DoctorServiceImpl(IDoctorDao iDoctorDao) {
        this.iDoctorDao = iDoctorDao;
    }

    @Override
    public List<Doctor> getAll() {
        return iDoctorDao.findAll();
    }

    @Override
    public List<Doctor> getByDepartment(String department) {
        return iDoctorDao.findByDepartment(department);
    }

    @Override
    public Doctor getById(int id) {
        return iDoctorDao.findById(id);
    }

    @Override
    public List<Doctor> getByPosition(String doctorPosition) {
        return iDoctorDao.findByPosition(doctorPosition);
    }
}
