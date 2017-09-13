package com.beyondtalent.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ManagePassword")
public class UpdatePassword {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer userID;
	
	@Column(name="Old_Password")
	private String oldPassword;
	
	@Column(name="New_Password")
	private String newPassword;
	
	@Column (name="PERSONAL_PASSWORD_ID")
	private Long personalPasswordId;
	
	

	public Long getPersonalPasswordId() {
		return personalPasswordId;
	}

	public void setPersonalPasswordId(Long personalPasswordId) {
		this.personalPasswordId = personalPasswordId;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	
	
	
	
	
}
