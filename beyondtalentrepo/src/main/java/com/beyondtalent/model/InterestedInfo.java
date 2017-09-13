package com.beyondtalent.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="INTERESTED_INFO")
public class InterestedInfo  implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 8458530023104706793L;
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="INTERESTED_ID",length=150)
	private Long InterestedId;
    @Column(name="INTERESTED_NAME",length=150)
	private String name;
	
	@Column(name="PERSONAL_INTERESTED_ID")
	private Long personalInterestedId;
    
	
	
    public Long getPersonalInterestedId() {
		return personalInterestedId;
	}
	public void setPersonalInterestedId(Long personalInterestedId) {
		this.personalInterestedId = personalInterestedId;
	}
	public Long getInterestedId() {
		return InterestedId;
	}
	public void setInterestedId(Long interestedId) {
		InterestedId = interestedId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
	
	
	
}
