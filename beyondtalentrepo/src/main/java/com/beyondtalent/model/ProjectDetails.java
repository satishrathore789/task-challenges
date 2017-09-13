package com.beyondtalent.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="PROJECT_DETAILS")
public class ProjectDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2701761858016608099L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PROJECT_ID",length=150)
	private Long projectId;
	@Column(name="PROJECT_COMPANY",length=150)
	private String pCompany;
	@Column(name="PROJECT_ROLES",length=150)
	private String pRoles;
	@Column(name="PROJECT_TITLE",length=150)
	private String pTitle;
	@Column(name="PROJECT_DURATION",length=150)
	private String pDuration;
	@Column(name="PROJECT_DISCRIPTION",length=150)
	private String pDiscription;
	
	
	@Column(name="PERSONAL_PROJECT_ID")
	private Long personalProjectId;
	
	
	
	
	
	
	
	public Long getPersonalProjectId() {
		return personalProjectId;
	}
	public void setPersonalProjectId(Long personalProjectId) {
		this.personalProjectId = personalProjectId;
	}
	public Long getProjectId() {
		return projectId;
	}
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}
	public String getpCompany() {
		return pCompany;
	}
	public void setpCompany(String pCompany) {
		this.pCompany = pCompany;
	}
	public String getpRoles() {
		return pRoles;
	}
	public void setpRoles(String pRoles) {
		this.pRoles = pRoles;
	}
	public String getpTitle() {
		return pTitle;
	}
	public void setpTitle(String pTitle) {
		this.pTitle = pTitle;
	}
	public String getpDuration() {
		return pDuration;
	}
	public void setpDuration(String pDuration) {
		this.pDuration = pDuration;
	}
	public String getpDiscription() {
		return pDiscription;
	}
	public void setpDiscription(String pDiscription) {
		this.pDiscription = pDiscription;
	}
	
	

}
