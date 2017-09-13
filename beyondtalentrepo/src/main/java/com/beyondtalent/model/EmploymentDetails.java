package com.beyondtalent.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="EMPLOYMENT_DETAILS")
public class EmploymentDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1144279078638475384L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="EMPLOYMENT_ID",length=50)
    private Long employmentId;
	@Column(name="DESIGNATION",length=50)
	private String designation;
	@Column(name="ORGANIZATION",length=50)
	private String organization;
	@Column(name="EMPLOYEE_FROM",length=50)
	private String employeeFrom;
	@Column(name="EMPLOYEE_TO",length=50)
	private String employeeTo;
	
	@Column(name="PERSONAL_EMPLOYMENT_ID")
	private Long personalEmploymentId;
	
	
	public Long getPersonalEmploymentId() {
		return personalEmploymentId;
	}
	public void setPersonalEmploymentId(Long personalEmploymentId) {
		this.personalEmploymentId = personalEmploymentId;
	}
	public Long getEmploymentId() {
		return employmentId;
	}
	public void setEmploymentId(Long employmentId) {
		this.employmentId = employmentId;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	


	public String getEmployeeFrom() {
		return employeeFrom;
	}
	public void setEmployeeFrom(String employeeFrom) {
		this.employeeFrom = employeeFrom;
	}
	public String getEmployeeTo() {
		return employeeTo;
	}
	public void setEmployeeTo(String employeeTo) {
		this.employeeTo = employeeTo;
	}
}