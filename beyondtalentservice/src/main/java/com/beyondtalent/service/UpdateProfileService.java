package com.beyondtalent.service;


import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beyondtalent.impl.UpdateProfileRepo;
import com.beyondtalent.model.PersonalInfo;

@Service
public class UpdateProfileService {


   @Autowired
   private UpdateProfileRepo updateProfileRepo;

  public void inserDataTables(PersonalInfo reg, HttpServletRequest request) {
	
	  HttpSession httpSession=request.getSession();
	      List list  =  (List) httpSession.getAttribute("state");
	     
	    //  System.out.println("on service layer insert method");
	      
	      Iterator ir = list.iterator();
	      
	      if (ir.hasNext())
	      {
	    	  PersonalInfo person = (PersonalInfo) ir.next();
	    	  System.out.println(person.getPersonalId());
	    	  System.out.println(person.getFirstName());
	    	  System.out.println(person.getEmail());
	    	  System.out.println(person.getCountry());
	    	  
	    	  reg.setPersonalId(person.getPersonalId());
	    	  reg.setEmail(person.getEmail());
	    	  reg.setPassword(person.getPassword());
	    	  
	    	 updateProfileRepo.save(reg);
	      }
	       
	      
	     
	   //  updateProfileRepo.save(per);
}
   
 
     public List insertedRecord(PersonalInfo personalInfo, HttpServletRequest request) {
    	 
    	 
		List<PersonalInfo> list1 = null;
		HttpSession httpSession = request.getSession();
		List list = (List) httpSession.getAttribute("state");
		Iterator it = list.iterator();
		if (it.hasNext()) {
			PersonalInfo per = (PersonalInfo) it.next();

			list1 = (List<PersonalInfo>) updateProfileRepo.findAll();
			// TODO Auto-generated method stub

		}
		return list1;
	}

}
