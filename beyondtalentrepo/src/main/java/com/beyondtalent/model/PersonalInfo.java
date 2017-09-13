package com.beyondtalent.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "PERSONAL_INFO")
public class PersonalInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1135385212483018794L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PERSONAL_ID", length = 150)
	private Long personalId;
	@Column(name = "FIRST_NAME", length = 150)
	private String firstName;

	@Column(name = "LAST_NAME", length = 150)
	private String lastName;

	@Column(name = "MIDDLE_NAME", length = 150)
	private String middleName;

	@Column(name = "DOB", length = 150)
	private String dob;

	@Transient
	private String day;
	@Transient
	private String month;
	@Transient
	private String year;

	@Column(name = "GENDER", length = 150)
	private String gender;

	@Column(name = "COUNTRY", length = 150)
	private String country;

	@Column(name = "STATE", length = 150)
	private String state;

	@Column(name = "CITY", length = 150)
	private String city;

	@Column(name = "ZIP_CODE", length = 150)
	private String zipCode;

	@Column(name = "PHONE_NUMBER", length = 20)
	private Long phoneNumber;

	@Column(name = "EMAIL", length = 150)
	private String email;

	@Column(name = "WEBSITE", length = 150)
	private String webSite;

	@Column(name = "USERNAME", length = 150)
	private String userName;

	@Column(name = "PASSWORD", length = 150)
	private String password;

	@Transient
	private String confirmPassword;

	@Transient
	private String searchTxt;

	public String getSearchTxt() {
		return searchTxt;
	}

	public void setSearchTxt(String searchTxt) {
		this.searchTxt = searchTxt;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	@OneToMany(fetch = FetchType.LAZY, targetEntity = Industry.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "PERSONAL_INDUSTRY_ID", referencedColumnName = "PERSONAL_ID")
	private List<Industry> listIndustry;

	@OneToMany(fetch = FetchType.LAZY, targetEntity = Skills.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "PERSONAL_SKILLS_ID", referencedColumnName = "PERSONAL_ID")
	private List<Skills> setSkills;

	@OneToMany(fetch = FetchType.LAZY, targetEntity = EmploymentDetails.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "PERSONAL_EMPLOYMENT_ID", referencedColumnName = "PERSONAL_ID")
	private List<EmploymentDetails> listEmploymentDetails;

	@OneToMany(fetch = FetchType.LAZY, targetEntity = ProjectDetails.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "PERSONAL_PROJECT_ID", referencedColumnName = "PERSONAL_ID")
	private List<ProjectDetails> listProject;

	@OneToMany(fetch = FetchType.LAZY, targetEntity = EducationDetails.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "PERSONAL_EDUCATION_ID", referencedColumnName = "PERSONAL_ID")
	private List<EducationDetails> listEducation;

	@OneToMany(fetch = FetchType.LAZY, targetEntity = InterestedInfo.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "PERSONAL_INTERESTED_ID", referencedColumnName = "PERSONAL_ID")
	private List<InterestedInfo> setInterested;

	@OneToMany(fetch = FetchType.LAZY, targetEntity = WebSiteInfo.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "PERSONAL_WEBSITE_ID", referencedColumnName = "PERSONAL_ID")
	private List<WebSiteInfo> setWebsite;


	@OneToMany(fetch = FetchType.LAZY, targetEntity = TimeLineDetail.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "PERSONAL_TIMELINE_ID" ,updatable=true,insertable=true, referencedColumnName = "PERSONAL_ID")
	private List<TimeLineDetail> listTimeline;

	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = ImageStore.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "PERSONAL_IMAGE_ID" ,updatable=true,insertable=true, referencedColumnName = "PERSONAL_ID")
	private List<ImageStore> listImage;
	
	
	
	
	
	
	public List<ImageStore> getListImage() {
		return listImage;
	}

	public void setListImage(List<ImageStore> listImage) {
		this.listImage = listImage;
	}

	public List<TimeLineDetail> getListTimeline() {
		return listTimeline;
	}

	public void setListTimeline(List<TimeLineDetail> listTimeline) {
		this.listTimeline = listTimeline;
	}

	public Long getPersonalId() {
		return personalId;
	}

	public void setPersonalId(Long personalId) {
		this.personalId = personalId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public List<Industry> getListIndustry() {
		return listIndustry;
	}

	public void setListIndustry(List<Industry> listIndustry) {
		this.listIndustry = listIndustry;
	}

	public List<Skills> getSetSkills() {
		return setSkills;
	}

	public void setSetSkills(List<Skills> setSkills) {
		this.setSkills = setSkills;
	}

	public List<EmploymentDetails> getListEmploymentDetails() {
		return listEmploymentDetails;
	}

	public void setListEmploymentDetails(List<EmploymentDetails> listEmploymentDetails) {
		this.listEmploymentDetails = listEmploymentDetails;
	}

	public List<ProjectDetails> getListProject() {
		return listProject;
	}

	public void setListProject(List<ProjectDetails> listProject) {
		this.listProject = listProject;
	}

	public List<EducationDetails> getListEducation() {
		return listEducation;
	}

	public void setListEducation(List<EducationDetails> listEducation) {
		this.listEducation = listEducation;
	}

	public List<InterestedInfo> getSetInterested() {
		return setInterested;
	}

	public void setSetInterested(List<InterestedInfo> setInterested) {
		this.setInterested = setInterested;
	}

	public List<WebSiteInfo> getSetWebsite() {
		return setWebsite;
	}

	public void setSetWebsite(List<WebSiteInfo> setWebsite) {
		this.setWebsite = setWebsite;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	

}
