package com.beyondtalent.controller;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.beyondtalent.model.EducationDetails;
import com.beyondtalent.model.EmploymentDetails;
import com.beyondtalent.model.PersonalInfo;
import com.beyondtalent.model.ProjectDetails;
import com.beyondtalent.service.ProjectDetailService;
import com.beyondtalent.service.UpdateEducationService;
import com.beyondtalent.service.updateWorkdetailService;


@Controller
public class EditEducation {

	
	@Autowired
	private UpdateEducationService eduservice;
	
	@Autowired
	private updateWorkdetailService employeeService;
	
	@Autowired
	private ProjectDetailService projectservice;
	
	@RequestMapping(value="editEducation", method=RequestMethod.GET)
	public String viewPage(ModelMap map,PersonalInfo per,HttpServletRequest request, RedirectAttributes attributes)
	{
	   EducationDetails edu = new EducationDetails();
	   EmploymentDetails emp = new EmploymentDetails();
	   ProjectDetails pro = new ProjectDetails();
	   
	     map.addAttribute("Edu", edu);
	    map.addAttribute("Emp", emp);
	    map.addAttribute("project", pro);
	  
	     
	     PersonalInfo list =  eduservice.showData(request);
	    //System.out.println(list.getListEducation().get(0).getFieldOfStudy());
	  
	     List list1 = list.getListEducation();
	    
	      Iterator ir = list1.iterator();
	      
	      if (ir.hasNext())
	      {
	    	EducationDetails  edu1 = (EducationDetails) ir.next();
	    	
	    	map.addAttribute("Edu",edu1);
	    	
	      }
	     
	     
		     PersonalInfo list2 =  employeeService.showData(request);
		    //System.out.println(list.getListEducation().get(0).getFieldOfStudy());
		    
		      List list3 = list2.getListEmploymentDetails();
		    
		      Iterator ir1 = list3.iterator();
		      
		      if (ir1.hasNext())
		      {
		    	EmploymentDetails  emp1 = (EmploymentDetails) ir1.next();
		    	
		    	map.addAttribute("Emp",emp1);
		    	
		      }
	      
	    

			 PersonalInfo list4 =  projectservice.showData(request);
			    //System.out.println(list.getListEducation().get(0).getFieldOfStudy());
			  
			     List list5 = list4.getListProject();
			    
			      Iterator ir4 = list5.iterator();
			      
			      if (ir4.hasNext())
			      {
			    	ProjectDetails  proj1 = (ProjectDetails) ir4.next();
			    	
			    	map.addAttribute("project",proj1);
			    	
			      }
		      
	    
	    
	         
	   return "editEducation";
	}
	
	
	@RequestMapping(value="educationupdate", method=RequestMethod.POST)
	public String updateEducation(@ModelAttribute("Edu") EducationDetails education, HttpServletRequest request,
			RedirectAttributes attributes)
	{
		/*System.out.println(education.getUniversity());
		System.out.println(education.getFieldOfStudy());*/
		
		eduservice.insertRecord(education,request);
		
		return "redirect:/editEducation";
	}
	
	
	
	
}

