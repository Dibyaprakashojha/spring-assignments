package com.hospitalapp;

import com.hospitalapp.model.Department;
import com.hospitalapp.model.Doctor;
import com.hospitalapp.model.Position;
import com.hospitalapp.service.IDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringHospitalappJdbcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringHospitalappJdbcApplication.class, args);
	}

	@Autowired
	IDoctorService iDoctorService;

	@Override
	public void run(String... args) throws Exception {
		iDoctorService.addDoctor(new Doctor("Awadhesh",Department.ORTHO,true,Position.SPECIALIST,500));
//		iDoctorService.updateDoctor(1000,1);
//		iDoctorService.getAll().forEach(System.out::println);
//		iDoctorService.getByDepartment(Department.ORTHO.name()).forEach(System.out::println);
//		iDoctorService.getByPosition(Position.SPECIALIST.name()).forEach(System.out::println);
//		System.out.println(iDoctorService.getById(1));
	}
}
