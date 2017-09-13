package com.beyondtalent.impl;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beyondtalent.model.PersonalInfo;

public interface ProjectShowRepo extends JpaRepository<PersonalInfo, Long> {

}
