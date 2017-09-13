package com.beyondtalent.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EDUCATION_DETAILS")
public class EducationDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7735125915033160761L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="EDUCATION_ID",length=150)
	private Long educationId;
	@Column(name="DEGREE",length=150)
	private String degree;
	@Column(name="FIELD_OF_STUDY",length=150)
	private String fieldOfStudy;
	@Column(name="UNIVERSITY",length=150)
	private String university;
	@Column(name="EDUCATION_FROM",length=150)
	private String educationFrom;
	@Column(name="EDUCATION_TO",length=150)
	private String educattionTo;
	
	@Column(name="PERSONAL_EDUCATION_ID")
	private Long personalEducationId;
	
	
	public Long getPersonalEducationId() {
		return personalEducationId;
	}
	public void setPersonalEducationId(Long personalEducationId) {
		this.personalEducationId = personalEducationId;
	}
	public Long getEducationId() {
		return educationId;
	}
	public void setEducationId(Long educationId) {
		this.educationId = educationId;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getFieldOfStudy() {
		return fieldOfStudy;
	}
	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getEducationFrom() {
		return educationFrom;
	}
	public void setEducationFrom(String educationFrom) {
		this.educationFrom = educationFrom;
	}
	public String getEducattionTo() {
		return educattionTo;
	}
	public void setEducattionTo(String educattionTo) {
		this.educattionTo = educattionTo;
	}
	
	
	

}
