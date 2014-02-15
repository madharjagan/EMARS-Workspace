package com.graburjob.emars.registration.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.graburjob.emars.registration.model.Appointment;
import com.graburjob.emars.registration.model.DoctorVisit;
import com.graburjob.emars.registration.model.PatientProfile;
import com.graburjob.emars.registration.model.User;

public class RegistrationDAO extends BaseDataBaseAccess {
	
	public int createUser(User user) {

		Connection connection = getDBConnection();
		int result = 0;
		String query = "INSERT INTO PASSWORDS(email, password) VALUES('"+user.getEmail()+"','"+user.getPassword()+"')";
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
	public int createDoctorVisit(DoctorVisit visit) {

		Connection connection = getDBConnection();
		int result = 0;
		String query = "INSERT INTO DOCTOR_VISIT(visitdate,symptoms,medication,report) VALUES('"+visit.getDate()+"','"+visit.getSymptoms()+"','"+visit.getMedication()+"','"+visit.getReport()+"')";
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
	
	public boolean isValidUser(String email,String password) {
		boolean isValidUser=false;
		Connection connection = getDBConnection();
		String query = "select password from passwords where email='" + email +"'";
		Statement stmt;
		try {
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			if (rs.next()) {
				
				if(password.equals(rs.getString("password")))
						{
					isValidUser=true;
						}
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isValidUser;
		
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
}
