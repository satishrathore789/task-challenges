package com.beyondtalent.impl;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.beyondtalent.model.PersonalInfo;

@Repository
public interface RegistrationRepo extends CrudRepository<PersonalInfo, Long> {

	
}
