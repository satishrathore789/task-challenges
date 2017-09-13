package com.beyondtalent.impl;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beyondtalent.model.PersonalInfo;

public interface EmployementShowRepo extends JpaRepository<PersonalInfo, Long> {

}
