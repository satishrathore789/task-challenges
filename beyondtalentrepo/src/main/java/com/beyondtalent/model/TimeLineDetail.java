package com.beyondtalent.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="TimeLine")
public class TimeLineDetail implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -265142909833808499L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TIMELINE_ID")
	
	private Long timelineId;
	@Column(name="TIMELINECHAR")
	private String timelineChar;
	@Column(name="PERSONAL_TIMELINE_ID")
	private Long personalTimelineId;
	
	
	
	

	public Long getTimelineId() {
		return timelineId;
	}
	public void setTimelineId(Long timelineId) {
		this.timelineId = timelineId;
	}
	public Long getPersonalTimelineId() {
		return personalTimelineId;
	}
	public void setPersonalTimelineId(Long personalTimelineId) {
		this.personalTimelineId = personalTimelineId;
	}
	public String getTimelineChar() {
		return timelineChar;
	}
	public void setTimelineChar(String timelineChar) {
		this.timelineChar = timelineChar;
	}
	
	
	
	

}
