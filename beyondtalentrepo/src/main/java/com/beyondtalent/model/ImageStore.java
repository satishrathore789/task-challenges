package com.beyondtalent.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ImageStore")
public class ImageStore implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -7246894498703710122L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IMAGE_ID")
	private Long ImageId;
	@Column(name="FILE")
	private String file;
	@Column(name="PERSONAL_IMAGE_ID")
	private Long personalImageId;
	
	public Long getImageId() {
		return ImageId;
	}
	public void setImageId(Long imageId) {
		ImageId = imageId;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public Long getPersonalImageId() {
		return personalImageId;
	}
	public void setPersonalImageId(Long personalImageId) {
		this.personalImageId = personalImageId;
	}
	
	
}
