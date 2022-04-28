package com.hospital.repository;

import com.hospital.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IDoctorRepository extends JpaRepository<Doctor,Integer> {

    //derived queries
    List<Doctor> findByDepartment(String department);
    List<Doctor> findByDoctorPosition(String doctorPosition);
    List<Doctor> findByFees(double fees);

}
