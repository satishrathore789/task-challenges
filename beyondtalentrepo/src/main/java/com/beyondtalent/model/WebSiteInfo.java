package com.beyondtalent.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="WEBSITE_INFO")
public class WebSiteInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7177807557074031791L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="WEBSITE_ID",length=150)
	private Long websiteId;
	@Column(name="WEBSITE_NAME",length=150)
	private String websiteName;
	
	public Long getWebsiteId() {
		return websiteId;
	}
	public void setWebsiteId(Long websiteId) {
		this.websiteId = websiteId;
	}
	public String getWebsiteName() {
		return websiteName;
	}
	public void setWebsiteName(String websiteName) {
		this.websiteName = websiteName;
	}

}
