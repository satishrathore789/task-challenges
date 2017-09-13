package com.beyondtalent.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.beyondtalent.model.EmploymentDetails;
import com.beyondtalent.model.InterestedInfo;
import com.beyondtalent.service.InterestService;

@Controller
public class EditInterestController {
	
	@Autowired
	private InterestService interestservice;

	@RequestMapping(value="editinterests", method=RequestMethod.GET)
	public String viewPage(ModelMap map)
	{
		InterestedInfo intrest = new InterestedInfo();
		map.addAttribute("INTREST", intrest);
		
	    return "editinterests";
		
	}
	
	
	@RequestMapping(value="editInterest", method=RequestMethod.POST)
	public String updateEducation(@ModelAttribute("INTREST") InterestedInfo intrest , HttpServletRequest request,
			RedirectAttributes attributes)
	{
		/*System.out.println(education.getUniversity());
		System.out.println(education.getFieldOfStudy());*/
		
		interestservice.insertRecord(intrest,request);
		
		return "editinterests";
	}
	
	
}
