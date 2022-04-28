package com.hospitalapp;

import com.hospitalapp.service.IDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HospitalappApplication implements CommandLineRunner {

	@Autowired
	IDoctorService iDoctorService;

	public static void main(String[] args) {
		SpringApplication.run(HospitalappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Doctor Details: \n");
		iDoctorService.getAll().forEach(System.out::println);
		System.out.println("\nDoctors By Department: \n");
		iDoctorService.getByDepartment("Cardio").forEach(System.out::println);
		System.out.println("\nDoctor By Id: \n");
		System.out.println(iDoctorService.getById(2));
		System.out.println("\nDoctors by Position: \n");
		iDoctorService.getByPosition("Surgeon").forEach(System.out::println);
	}
}
