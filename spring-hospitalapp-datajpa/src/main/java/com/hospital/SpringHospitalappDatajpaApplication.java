package com.hospital;

import com.hospital.model.Department;
import com.hospital.model.Doctor;
import com.hospital.model.Patient;
import com.hospital.model.Position;
import com.hospital.service.IDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SpringHospitalappDatajpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringHospitalappDatajpaApplication.class, args);
	}

	@Autowired
	private IDoctorService iDoctorService;

	@Override
	public void run(String... args) throws Exception {
		Patient patient1 = new Patient("Thair","Stomach Ache",Department.MED);
		Patient patient2 = new Patient("Raina","Ulcer",Department.MED);
		Patient patient3 = new Patient("Barsha","Soriosis",Department.MED);
//		Patient patient4 = new Patient("Akash","Heart infection",Department.MED);

		Set<Patient> patients = new HashSet<>(Arrays.asList(patient1,patient2,patient3));
//		iDoctorService.addDoctor(new Doctor("Suresh",true, Position.SPECIALIST,599.0, Department.MED,patients));
	}
}
