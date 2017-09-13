package com.beyondtalent.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="SKILLS")
public class Skills implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2432002472701011203L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SKILL_ID",length=150)
	private Long skillId;
	@Column(name="SKILLS",length=150)
	private String skills;
	@Column(name="YEARS",length=150)
	private String years;
	
	
	@Column(name="PERSONAL_SKILLS_ID")
	private Long personalSkillId;
	
	
	
	public Long getPersonalSkillId() {
		return personalSkillId;
	}
	public void setPersonalSkillId(Long personalSkillId) {
		this.personalSkillId = personalSkillId;
	}
	public Long getSkillId() {
		return skillId;
	}
	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getYears() {
		return years;
	}
	public void setYears(String years) {
		this.years = years;
	}

}
