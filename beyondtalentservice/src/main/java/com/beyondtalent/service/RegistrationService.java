package com.beyondtalent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beyondtalent.impl.RegistrationRepo;
import com.beyondtalent.model.PersonalInfo;

@Service
public class RegistrationService {
	@Autowired
	RegistrationRepo registrationRepo;

	public void saveUser(PersonalInfo registration) {
	registration.setDob(registration.getDay()+"/"+registration.getMonth()+"/"+registration.getYear());	
		
		registrationRepo.save(registration);
		
	}
	
	

}
