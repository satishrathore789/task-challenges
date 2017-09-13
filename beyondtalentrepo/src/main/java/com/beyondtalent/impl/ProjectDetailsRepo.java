package com.beyondtalent.impl;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beyondtalent.model.ProjectDetails;

public interface ProjectDetailsRepo extends JpaRepository<ProjectDetails, Long> {

}
