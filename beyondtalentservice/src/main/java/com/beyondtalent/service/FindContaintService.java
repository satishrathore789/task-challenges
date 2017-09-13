package com.beyondtalent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beyondtalent.impl.FindContantRepogitory;
import com.beyondtalent.model.PersonalInfo;

@Service
public class FindContaintService {

	@Autowired
     private FindContantRepogitory findcontaintrepo;
	
	// @Autowired
	// private FindByNameRepo findname;
	
	
/*	public List findByContaint(String searchTxt) {
		
		return findcontaintrepo.findByContain(searchTxt);
	}
	*/
	
  

 public  List<PersonalInfo> findByFirstName(String searchTxt)
	{
	// TODO Auto-generated method stub
	System.out.println(searchTxt);
	return  findcontaintrepo.findByFirstNameContaining(searchTxt);
}


public List<PersonalInfo> findByLastname(String searchTxt) {
	// TODO Auto-generated method stub
	return findcontaintrepo.findByLastNameContaining(searchTxt);
}


public List<Object[]> FindBySkill(String searchTxt) {
	return findcontaintrepo.findByContain(searchTxt);
}
	



}
