package com.beyondtalent.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beyondtalent.impl.EditProfileRepo;
import com.beyondtalent.model.PersonalInfo;

@Service
public class EditProfileService {
	
	@Autowired 
	EditProfileRepo editProfileRepo;

	

	public PersonalInfo findOne(Long registrationId) {
		// TODO Auto-generated method stub
		return  editProfileRepo.findOne(registrationId);
	}

}
