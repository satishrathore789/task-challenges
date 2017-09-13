package com.beyondtalent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beyondtalent.impl.LoginRepository;
import com.beyondtalent.model.PersonalInfo;


@Service
public class LoginService {
 
 @Autowired
 private LoginRepository loginRepository;
	

 
	public List<PersonalInfo> findByPasswordAndEmailId(String password, String emailId) {
		// TODO Auto-generated method stub
		return loginRepository.findByPasswordAndEmail(password, emailId);
	}

		
	



	
}