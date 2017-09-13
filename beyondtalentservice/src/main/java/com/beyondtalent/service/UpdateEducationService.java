package com.beyondtalent.service;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beyondtalent.impl.EducationShowRepo;
import com.beyondtalent.impl.EducationUpdateRepo;
import com.beyondtalent.model.EducationDetails;
import com.beyondtalent.model.PersonalInfo;

@Service
public class UpdateEducationService {
	
	@Autowired
	private EducationUpdateRepo educationrepo;
	
	@Autowired
	private EducationShowRepo edushowRepo;

	public void insertRecord(EducationDetails education, HttpServletRequest request) {
		HttpSession httpSession = request.getSession();
		List list  =  (List) httpSession.getAttribute("state");
		
          Iterator  ir = list.iterator();
          
          if (ir.hasNext())
          {
        	  PersonalInfo personal = (PersonalInfo) ir.next();
        	  education.setPersonalEducationId(personal.getPersonalId());
        	  
        	  educationrepo.save(education);
          }
          
          
	}

	public PersonalInfo showData(HttpServletRequest request) {
		
	   PersonalInfo per3 = null;
		HttpSession httpSession = request.getSession();
		List list = (List) httpSession.getAttribute("state");
		Iterator it = list.iterator();
		if (it.hasNext()) {
			PersonalInfo per = (PersonalInfo) it.next();

	    	 per3 = edushowRepo.findOne(per.getPersonalId());
			
		}
		return per3;
	
	}

}
