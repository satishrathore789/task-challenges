package com.beyondtalent.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.beyondtalent.model.PersonalInfo;

@Component
public class RegistrationValidator {

	@Autowired
	private RegistrationUtils registrationUtils;
	@Autowired
	private PasswordValidation passwordValidation;
	@Autowired
	private EmailValidation emailValidation;

	public boolean supports(Class<?> clazz) {
		return PersonalInfo.class.isAssignableFrom(clazz);

	}

	public void validate(Object target, Errors errors) {
		PersonalInfo registration = (PersonalInfo) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "registration.email.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "registration.password.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "registration.name.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "registration.lastname.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword", "registration.confirmpassword.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "city", "registration.city.empty");
		
		
		
		if (!registration.getEmail().isEmpty() && registration.getEmail().trim().length() > 0)
			if (!emailValidation.emailValid(registration.getEmail())) 
				errors.rejectValue("email", "registration.email.invalid");

		if (!registration.getPassword().isEmpty() && registration.getPassword().trim().length() > 0)
			if (!passwordValidation.passwordValid(registration.getPassword()))
				errors.rejectValue("password", "registration.password.invalid");
		if (!registration.getConfirmPassword().isEmpty() && registration.getConfirmPassword().trim().length() > 0)
			if (!passwordValidation.passwordValid(registration.getConfirmPassword()))
				errors.rejectValue("password", "registration.password.invalid");
		    if(!registration.getPassword().equals(registration.getConfirmPassword()))
		       errors.rejectValue("password", "notmatch.password"); 	
		
		if (!registration.getEmail().isEmpty() && registration.getEmail().trim().length() > 0)
			if (!emailValidation.emailValid(registration.getEmail()))
				errors.rejectValue("email", "registration.email.invalid");
		if(!registration.getFirstName().isEmpty() && registration.getFirstName().trim().length()>0)
			if(!registrationUtils.valid(registration.getFirstName()))
			errors.rejectValue("firstName", "registration.name.invalid");
		if(!registration.getLastName().isEmpty() && registration.getLastName().trim().length()>0)
			if(!registrationUtils.valid(registration.getLastName()))
			errors.rejectValue("lastName", "registration.lastname.invalid");
		
		
		
		
	}

	}

