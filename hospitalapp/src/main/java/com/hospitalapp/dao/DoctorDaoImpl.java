package com.hospitalapp.dao;

import com.hospitalapp.model.Doctor;
import org.springframework.stereotype.Component;

import javax.print.Doc;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class DoctorDaoImpl implements IDoctorDao{
    @Override
    public List<Doctor> findAll() {
        return showAll().stream().sorted(Comparator.comparing(Doctor::getDoctorName)).collect(Collectors.toList());
    }

    @Override
    public List<Doctor> findByDepartment(String department) {
        return showAll().stream().filter(doctor -> doctor.getDepartment().equalsIgnoreCase(department)).sorted(Comparator.comparing(Doctor::getDoctorName)).collect(Collectors.toList());
    }

    @Override
    public Doctor findById(int id) {
        return showAll().stream().filter(doctor -> doctor.getDoctorId().equals(id)).findAny().get();
    }

    @Override
    public List<Doctor> findByPosition(String doctorPosition) {
        return showAll().stream().filter(doctor -> doctor.getDoctorPosition().equalsIgnoreCase(doctorPosition)).sorted(Comparator.comparing(Doctor::getDoctorName)).collect(Collectors.toList());
    }

    public List<Doctor> showAll() {
        List<Doctor> doctors = Arrays.asList(new Doctor(1,"Suresh","Ortho",1,"Surgeon",500),
                new Doctor(2,"Awadhesh","Ortho",1,"Specialist",800),
                new Doctor(3,"Abuthair","Cardio",1,"Specialist",900),
                new Doctor(4,"Sandeep","Cardio",1,"Surgeon",600),
                new Doctor(5,"Akash","Cardio",1,"Surgeon",550));
        return doctors;
    }
}
