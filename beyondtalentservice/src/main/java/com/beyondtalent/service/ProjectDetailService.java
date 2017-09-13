package com.beyondtalent.service;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beyondtalent.impl.ProjectDetailsRepo;
import com.beyondtalent.impl.ProjectShowRepo;
import com.beyondtalent.model.EducationDetails;
import com.beyondtalent.model.EmploymentDetails;
import com.beyondtalent.model.PersonalInfo;
import com.beyondtalent.model.ProjectDetails;

@Service
public class ProjectDetailService {
	
	@Autowired
	private ProjectDetailsRepo projectRepo;

   @Autowired
   private ProjectShowRepo projshow;
	
	
	
	public void insertRecord(ProjectDetails proj, HttpServletRequest request) {
		
		HttpSession httpSession = request.getSession();
		List list  =  (List) httpSession.getAttribute("state");
		
          Iterator  ir = list.iterator();
          
          if (ir.hasNext())
          {
        	  PersonalInfo personal = (PersonalInfo) ir.next();
        	//  proj.setPersonalEducationId(personal.getPersonalId());
        	  
        	  proj.setPersonalProjectId(personal.getPersonalId());
        	  
        	  projectRepo.save(proj);
          }
		
	}

	public PersonalInfo showData(HttpServletRequest request) {
		
		   PersonalInfo per3 = null;
			HttpSession httpSession = request.getSession();
			List list = (List) httpSession.getAttribute("state");
			Iterator it = list.iterator();
			if (it.hasNext()) {
				PersonalInfo per = (PersonalInfo) it.next();

		    	 per3 = projshow.findOne(per.getPersonalId());
				
		    	 
		    	 
	            
			}
			return per3;
		
		}
	
	}
