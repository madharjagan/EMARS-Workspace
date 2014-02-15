package com.graburjob.emars.registration.service;

import com.graburjob.emars.registration.model.Appointment;
import com.graburjob.emars.registration.model.DoctorVisit;
import com.graburjob.emars.registration.model.PatientProfile;
import com.graburjob.emars.registration.model.User;

public interface IRegistrationService {
	
	public int createUser(User user);
	public User getUser(String userId);
	public int createPatientProfile(PatientProfile patientProfile);
	public int createDoctorVisit(DoctorVisit visit);
	public PatientProfile getPatientProfile(String email);
	public boolean isValidUser(String email,String password);
	public int getAppointment(Appointment appoint);
	
}
