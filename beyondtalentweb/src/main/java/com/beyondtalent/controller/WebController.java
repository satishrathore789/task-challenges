package com.beyondtalent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.beyondtalent.model.PersonalInfo;
 
@Controller
public class WebController {
 
	@RequestMapping("/")
	String home(ModelMap  map) {
		
		PersonalInfo info = new PersonalInfo();
		map.addAttribute("reg",info);
		
		
		return "login";
	}
}