package com.beyondtalent.service;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beyondtalent.impl.EmployeementUpdateRepo;
import com.beyondtalent.impl.EmployementShowRepo;
import com.beyondtalent.model.EducationDetails;
import com.beyondtalent.model.EmploymentDetails;
import com.beyondtalent.model.PersonalInfo;

@Service
public class updateWorkdetailService {
	
	@Autowired
	private EmployeementUpdateRepo employeeRepo;
	
	@Autowired
	private EmployementShowRepo employeeshowrepo;
	
	
	public void insertRecord(EmploymentDetails emp, HttpServletRequest request) {
		
		HttpSession httpSession = request.getSession();
		List list  =  (List) httpSession.getAttribute("state");
		
          Iterator  ir = list.iterator();
          
          if (ir.hasNext())
          {
        	  PersonalInfo personal = (PersonalInfo) ir.next();
        	  emp.setPersonalEmploymentId(personal.getPersonalId());
        	  
        	  employeeRepo.save(emp);
          }
          
        
		
	}


	public PersonalInfo showData(HttpServletRequest request) {
		
		   PersonalInfo per3 = null;
			HttpSession httpSession = request.getSession();
			List list = (List) httpSession.getAttribute("state");
			Iterator it = list.iterator();
			if (it.hasNext()) {
				PersonalInfo per = (PersonalInfo) it.next();

		    	 per3 = employeeshowrepo.findOne(per.getPersonalId());
				
		    	
			}
			return per3;
		
		}
	
		
		
		
	

	
	
}
