package com.beyondtalent.service;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beyondtalent.impl.InterestRepo;
import com.beyondtalent.model.InterestedInfo;
import com.beyondtalent.model.PersonalInfo;

@Service
public class InterestService {
	
	@Autowired
	
	private InterestRepo interestRepo;

	public void insertRecord(InterestedInfo intrest, HttpServletRequest request) {
		// TODO Auto-generated method stub
		
		HttpSession httpSession = request.getSession();
		List list  =  (List) httpSession.getAttribute("state");
		
          Iterator  ir = list.iterator();
          
          if (ir.hasNext())
          {
        	  PersonalInfo personal = (PersonalInfo) ir.next();
        	  //emp.setPersonalEmploymentId(personal.getPersonalId());
        	  
        	  intrest.setPersonalInterestedId(personal.getPersonalId());
        	  
        	  interestRepo.save(intrest);
          }
          
		
	}

}
