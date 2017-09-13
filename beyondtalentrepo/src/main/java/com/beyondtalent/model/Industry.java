package com.beyondtalent.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="INDUSTRY")
public class Industry implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5321753056696554862L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="INDUSTRY_ID",length=150)
	private Long industryId;
	@Column(name="INDUSTRY",length=150)
	private String industry;
	
	@Column(name="FUNCTION",length=150)
	private String function;
	
	@Column(name="PERSONAL_INDUSTRY_ID")
	private Long personalIndustryId;
	
	
	
	public Long getPersonalIndustryId() {
		return personalIndustryId;
	}
	public void setPersonalIndustryId(Long personalIndustryId) {
		this.personalIndustryId = personalIndustryId;
	}
	public Long getIndustryId() {
		return industryId;
	}
	public void setIndustryId(Long industryId) {
		this.industryId = industryId;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getFunction() {
		return function;
	}
	public void setFunction(String function) {
		this.function = function;
	}
	

}
