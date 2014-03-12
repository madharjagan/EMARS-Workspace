package com.graburjob.emars.registration.service;

import java.util.List;

import com.graburjob.emars.registration.model.Appointment;
import com.graburjob.emars.registration.model.Doctor;
//import com.graburjob.emars.registration.model.DoctorVisit;
import com.graburjob.emars.registration.model.PatientProfile;
import com.graburjob.emars.registration.model.User;
import com.mysql.jdbc.Blob;

public interface IRegistrationService {
	
	public int createUser(User user);
	public User getUser(String userId);
	public int createPatientProfile(PatientProfile patientProfile);
	public PatientProfile getPatientProfile(String email);
	public String isValidUser(String email,String password);
	public int getAppointment(Appointment appoint);
	public int createDoctor(Doctor doctor);
	public List<Doctor> getPatientMedication(String email);
	public Blob getImage(String email);
	
	
}
