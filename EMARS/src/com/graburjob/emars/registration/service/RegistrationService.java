package com.graburjob.emars.registration.service;

import java.util.List;

import com.graburjob.emars.registration.dao.RegistrationDAO;
import com.graburjob.emars.registration.model.Appointment;
import com.graburjob.emars.registration.model.Doctor;
import com.graburjob.emars.registration.model.PatientProfile;
import com.graburjob.emars.registration.model.User;
import com.mysql.jdbc.Blob;

public class RegistrationService implements IRegistrationService{

	@Override
	public int createUser(User user) {
		RegistrationDAO rDAO = new RegistrationDAO();
		return rDAO.createUser(user);
	}

	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createPatientProfile(PatientProfile patientprofile) {
		RegistrationDAO rDAO = new RegistrationDAO();
		return rDAO.createPatientProfile(patientprofile);
	}
	
	@Override
	public PatientProfile getPatientProfile(String email) {
	    RegistrationDAO rDAO = new RegistrationDAO();
		return rDAO.getPatientProfile(email);
	}
	
	@Override
	public String isValidUser (String email,String password) {
	    RegistrationDAO rDAO = new RegistrationDAO();
		return rDAO.isValidUser(email,password);
	}
	@Override
	public int getAppointment(Appointment appoint) {
		RegistrationDAO rDAO = new RegistrationDAO();
		return rDAO.getAppointment(appoint);
	}
	
	@Override
	public int createDoctor(Doctor doctor) {
		RegistrationDAO rDAO = new RegistrationDAO();
		return rDAO.createDoctor(doctor);
	}

	@Override
	public List<Doctor> getPatientMedication(String email) {
		RegistrationDAO rDAO = new RegistrationDAO();
		return rDAO.getPatientMedication(email);
	}
	@Override
	public Blob getImage(String email) {
		RegistrationDAO rDAO = new RegistrationDAO();
		return rDAO.getImage(email);
	}
	
	
}
