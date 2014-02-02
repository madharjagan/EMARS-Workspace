package com.graburjob.emars.registration.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

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

}
