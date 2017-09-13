package com.beyondtalent.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.beyondtalent.model.EmploymentDetails;
import com.beyondtalent.model.ProjectDetails;
import com.beyondtalent.service.ProjectDetailService;

@Controller
public class ProjectDetailController {
	
	@Autowired
	private ProjectDetailService projservice;

	@RequestMapping(value="projectUpdate", method=RequestMethod.POST)
	public String updateEducation(@ModelAttribute("project") ProjectDetails proj, HttpServletRequest request,
			RedirectAttributes attributes)
	{
		/*System.out.println(education.getUniversity());
		System.out.println(education.getFieldOfStudy());*/
		
		projservice.insertRecord(proj,request);
		
		return "redirect:/editEducation";
	}
	
	
	
}
