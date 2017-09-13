package com.beyondtalent.impl;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beyondtalent.model.InterestedInfo;

public interface InterestRepo extends JpaRepository<InterestedInfo, Long> {

	
	
}
