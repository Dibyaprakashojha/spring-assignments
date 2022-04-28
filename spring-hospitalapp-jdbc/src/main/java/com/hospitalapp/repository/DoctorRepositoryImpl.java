package com.hospitalapp.repository;

import com.hospitalapp.model.Doctor;
import com.hospitalapp.util.Queries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class DoctorRepositoryImpl implements IDoctorRepository{

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public void addDoctor(Doctor doctor) {
        Object[] doctorsArray = {doctor.getDoctorName(),
                doctor.getDoctorPosition().name(),doctor.getDepartment().dept,
                doctor.getFees(),doctor.isAvailability()};
        jdbcTemplate.update(Queries.INSERTQUERY,doctorsArray);
    }

    @Override
    public void updateDoctor(int fees, int doctorId) {
        jdbcTemplate.update(Queries.UPDATEQUERY,fees,doctorId);
    }

    @Override
    public void deleteDoctor(int doctorId) {
        jdbcTemplate.update(Queries.DELETEQUERY,doctorId);
    }

    @Override
    public List<Doctor> findAll() {
        return jdbcTemplate.query(Queries.SELECTQUERY,new DoctorMapper());
    }

    @Override
    public List<Doctor> findByDepartment(String department) {
        return jdbcTemplate.query(Queries.DEPARTMENTQUERY,new DoctorMapper(),department);
    }

    @Override
    public Doctor findById(int id) {
        return jdbcTemplate.queryForObject(Queries.IDQUERY,new DoctorMapper(),id);
    }

    @Override
    public List<Doctor> findByPosition(String doctorPosition) {
        return jdbcTemplate.query(Queries.POSITIONQUERY,new DoctorMapper(),doctorPosition);
    }
}
