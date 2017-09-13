package com.beyondtalent.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.beyondtalent.model.PersonalInfo;
import com.beyondtalent.service.RegistrationService;
import com.beyondtalent.validator.RegistrationValidator;

@Controller
public class RegisterController {
	
	@Autowired
	RegistrationService registrationService;
	@Autowired
	RegistrationValidator registrationValidator;
	

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerUser(ModelMap map, HttpSession session) {
		System.out.println("get method of the controller");
	PersonalInfo personal = new PersonalInfo();
		map.put("register", personal);

		return "registration";
	}

	@RequestMapping(value = "/submitlog", method = RequestMethod.POST)
	public String submitlogin(@ModelAttribute("register") PersonalInfo registration, BindingResult results,
			HttpServletRequest request, HttpServletResponse response, HttpSession session,ModelMap map) {
				
		
	registrationValidator.validate(registration, results);
		if(results.hasErrors())
		{
			return "registration";
		}
		else
		{
 		System.out.println("inside controller");
		System.out.println("Email:" + registration.getPassword());
		System.out.println("password:" + registration.getEmail());
		 registrationService.saveUser(registration);
		  return "redirect:/";
		
	}
		
	}
}
