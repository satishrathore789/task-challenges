package com.beyondtalent.controller;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.beyondtalent.model.PersonalInfo;
import com.beyondtalent.service.UpdateProfileService;

@Controller
public class EditprofileController {

	@Autowired
	private UpdateProfileService updateProfileService;

	@RequestMapping(value = "editprofile", method = RequestMethod.GET)
	public String prohome(Model map, HttpServletRequest request, RedirectAttributes attributes,
			HttpSession httpSession) {
		PersonalInfo personalInfo = new PersonalInfo();
		map.addAttribute("REG", personalInfo);

		List<PersonalInfo> mylist = updateProfileService.insertedRecord(personalInfo, request);
		
		Iterator ir = mylist.iterator();
		
		if (ir.hasNext()) {
			PersonalInfo per = (PersonalInfo) ir.next();
			
		/*	System.out.println(per.getFirstName());
			System.out.println(per.getZipCode());
		*/
		
		/*for (Object result : mylist) {
			System.out.println(result);
		
		}*/

		map.addAttribute("REG", per);

		
		}
		return "editprofile";
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String edithome(@ModelAttribute("REG") @Valid PersonalInfo reg, HttpServletRequest request,
			RedirectAttributes attributes) {
		/*System.out.println("on post method of profile");
		System.out.println(reg.getPersonalId());
		System.out.println(reg.getFirstName());
		System.out.println(reg.getLastName());
		System.out.println(reg.getDob());
		System.out.println(reg.getEmail());
		System.out.println(reg.getZipCode());*/

		updateProfileService.inserDataTables(reg, request);

		// updateProfileService.updateTables(reg, request);

		return "editprofile";

	}

}
