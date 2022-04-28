package com.hospitalapp.repository;

import com.hospitalapp.model.Department;
import com.hospitalapp.model.Doctor;
import com.hospitalapp.model.Position;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DoctorMapper implements RowMapper<Doctor> {
    @Override
    public Doctor mapRow(ResultSet rs, int rowNum) throws SQLException {
        Doctor doctor = new Doctor();
        doctor.setDoctorId(rs.getInt("doctor_id"));
        doctor.setDoctorName(rs.getString("doctor_name"));
        doctor.setDoctorPosition(Position.valueOf(rs.getString("doctor_position")));
        doctor.setDepartment(Department.valueOf(rs.getString("department")));
        doctor.setFees(rs.getInt("doctor_fees"));
        doctor.setAvailability(rs.getBoolean("availability"));
        return doctor;
    }
}
