package com.beyondtalent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.beyondtalent.model.PersonalInfo;

@Controller
public class UpdatePassword {

	@RequestMapping(value="editprofilePassword", method= RequestMethod.GET)
	public String viewPage(ModelMap map)
	{
		PersonalInfo personal = new PersonalInfo();
		map.addAttribute("PASS",personal);
		
		return "editprofilePassword";
	}
	
	
	@RequestMapping(value="updatepassword", method= RequestMethod.POST)
	public String updatePass(@ModelAttribute("PASS") PersonalInfo personal , ModelMap map )
	{
		System.out.println(personal.getPassword());
		
		return "editprofilePassword";
	}
	
	
	
	
}
