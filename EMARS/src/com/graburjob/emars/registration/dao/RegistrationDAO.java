package com.graburjob.emars.registration.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.graburjob.emars.registration.model.Appointment;
import com.graburjob.emars.registration.model.Doctor;
import com.graburjob.emars.registration.model.PatientProfile;
import com.graburjob.emars.registration.model.User;

public class RegistrationDAO extends BaseDataBaseAccess {
	
	public int createUser(User user) {

		Connection connection = getDBConnection();
		int result = 0;
		String query = "INSERT INTO PASSWORDS(email, password,role) VALUES('"+user.getEmail()+"','"+user.getPassword()+"','"+user.getRole()+"')";
		System.out.println(query);
		Statement stmt;
		try {
			stmt = connection.createStatement();
			result = stmt.executeUpdate(query);
			System.out.println("Result ********" + result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public int createPatientProfile(PatientProfile patientprofile) {

		Connection connection = getDBConnection();
		int result = 0;
		String query = "INSERT INTO PATIENT_PROFILE(name,gender,dob,address,email,contact) VALUES('"+patientprofile.getName()+"','"+patientprofile.getGender()+"','"+patientprofile.getDob()+"','"+patientprofile.getAddress()+"','"+patientprofile.getEmail()+"','"+patientprofile.getContact()+"')";
		System.out.println(query);
		Statement stmt;
		try {
			stmt = connection.createStatement();
			result = stmt.executeUpdate(query);
			System.out.println("Result ********" + result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public PatientProfile getPatientProfile(String email) {
		PatientProfile patientProfile=null;
		Connection connection = getDBConnection();
		String query = "select name,gender,dob,email,contact,address from patient_profile where email='" + email +"'";
		Statement stmt;
		try {
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			if (rs.next()) {
				patientProfile = new PatientProfile();
				patientProfile.setName(rs.getString("name"));
				patientProfile.setGender(rs.getString("gender"));
				patientProfile.setDOB(rs.getString("dob"));
				patientProfile.setEmail(rs.getString("email"));
				patientProfile.setContact(rs.getString("contact"));
				patientProfile.setAddress(rs.getString("address"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return patientProfile;		
	}
	
	public List<Doctor> getPatientMedication(String email) {
		List<Doctor> listOfMedications = new ArrayList<Doctor>(); 
		Doctor doctor=null;
		Connection connection = getDBConnection();
		String query = "select visitdate, symptoms, medication, report from DOCTOR_VISIT where email='" + email +"'";
		Statement stmt;
		try {
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			while(rs.next()) {
				doctor = new Doctor();
				doctor.setEmail(email);
				doctor.setDate(rs.getString("visitdate"));
				doctor.setSymptoms(rs.getString("symptoms"));
				doctor.setMedication(rs.getString("medication"));
				doctor.setReport(rs.getString("report"));	
				listOfMedications.add(doctor);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listOfMedications;		
	}
	
	public String isValidUser(String email,String password) {
		String role ="";
		Connection connection = getDBConnection();
		String query = "select password,role from passwords where email='" + email +"'";
		Statement stmt;
		try {
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			if (rs.next()) {
				
				if(password.equals(rs.getString("password")))
				{
					role=rs.getString("role");
				}
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return role;
		
	}
	
	public int getAppointment(Appointment appoint) {

		Connection connection = getDBConnection();
		int result = 0;
		String query = "INSERT INTO DOCTOR_APPOINTMENT(doctorname,Appdate,Apptime) VALUES('"+appoint.getName()+"','"+appoint.getDate()+"','"+appoint.getTime()+"')";
		System.out.println(query);
		Statement stmt;
		try {
			stmt = connection.createStatement();
			result = stmt.executeUpdate(query);
			System.out.println("Result ********" + result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int createDoctor(Doctor doctor) {

		Connection connection = getDBConnection();
		int result=0;
		String query = "INSERT INTO DOCTOR_VISIT(visitdate,symptoms,medication,report,email) VALUES('"+doctor.getDate()+"','"+doctor.getSymptoms()+"','"+doctor.getMedication()+"','"+doctor.getReport()+"','"+doctor.getEmail()+"')";
		
		System.out.println(query);
		
		Statement stmt;
		try {
			stmt = connection.createStatement();
			result = stmt.executeUpdate(query);
			
			System.out.println("Result ********" + result);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
		
	}

	
}
