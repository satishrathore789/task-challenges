package com.beyondtalent.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.beyondtalent.model.PersonalInfo;

import com.beyondtalent.service.LoginService;
import com.beyondtalent.validator.LoginValidator;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@Autowired
	private LoginValidator loginValidator;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String registerUser(Model map, HttpSession seHttpSession) {
		PersonalInfo personal = new PersonalInfo();

		map.addAttribute("reg", personal);

		return "login";
	}

	@RequestMapping(value = "/userlogin", method = RequestMethod.POST)
	public String loginUser(@ModelAttribute("reg") PersonalInfo registration, HttpServletRequest request,
			BindingResult result, HttpServletResponse response, HttpSession session, Model map,
			RedirectAttributes attributes) {

		System.out.println(registration.getPassword());
		System.out.println(registration.getEmail());

		loginValidator.validate(registration, result);
		if (result.hasErrors())
			return "login";

		List<PersonalInfo> list = loginService.findByPasswordAndEmailId(registration.getPassword(),
				registration.getEmail());
		if (!list.isEmpty()) {
			session = request.getSession();
			session.setAttribute("state", list);

			return "redirect:timeline";
		} else {
			map.addAttribute("error", "Invalid Username or Password");
			return "login";
		}

	}

}
