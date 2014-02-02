package com.graburjob.emars.registration.service;

import com.graburjob.emars.registration.model.User;

public interface IRegistrationService {
	
	public int createUser(User user);
	public User getUser(String userId);

}
