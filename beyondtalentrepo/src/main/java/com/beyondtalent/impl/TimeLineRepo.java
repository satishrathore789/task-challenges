package com.beyondtalent.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beyondtalent.model.PersonalInfo;
@Repository
public interface TimeLineRepo extends JpaRepository<PersonalInfo, Long> {

}
