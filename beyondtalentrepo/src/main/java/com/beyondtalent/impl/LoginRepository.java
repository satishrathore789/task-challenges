package com.beyondtalent.impl;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beyondtalent.model.PersonalInfo;

@Repository
public interface LoginRepository extends JpaRepository<PersonalInfo,Long > {


	//@Modifying
	//   @Query("update Product p set p.description = ?2 where p.productId = ?1")
	//@Query("from registration R where R.password = ?3 and R.emailId=?2")
	public List<PersonalInfo> findByPasswordAndEmail( String password,String email);
	
	
	
	

}
