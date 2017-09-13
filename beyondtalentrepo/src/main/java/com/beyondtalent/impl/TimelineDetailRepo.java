package com.beyondtalent.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beyondtalent.model.TimeLineDetail;
@Repository
public interface TimelineDetailRepo extends JpaRepository<TimeLineDetail, Long> {

}
