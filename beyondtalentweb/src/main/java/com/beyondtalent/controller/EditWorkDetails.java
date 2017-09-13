package com.beyondtalent.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.beyondtalent.model.EmploymentDetails;
import com.beyondtalent.service.updateWorkdetailService;



@Controller
public class EditWorkDetails {

	@Autowired
	public updateWorkdetailService workService;
	
	@RequestMapping(value="updateworkinfo", method=RequestMethod.POST)
	public String updateEducation(@ModelAttribute("Emp") EmploymentDetails emp, HttpServletRequest request,
			RedirectAttributes attributes)
	{
		/*System.out.println(education.getUniversity());
		System.out.println(education.getFieldOfStudy());*/
		
		workService.insertRecord(emp,request);
		
		return "redirect:/editEducation";
	}
	
}
