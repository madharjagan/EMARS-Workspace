package com.graburjob.emars.registration.service;

import com.graburjob.emars.registration.dao.RegistrationDAO;
import com.graburjob.emars.registration.model.User;

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

}
