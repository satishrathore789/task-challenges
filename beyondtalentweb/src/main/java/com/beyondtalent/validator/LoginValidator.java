package com.beyondtalent.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.beyondtalent.model.PersonalInfo;

@Component
public class LoginValidator {
	
	 @Autowired
	 EmailValidation emailValidation;
	 @Autowired
	 PasswordValidation passwordValidation;
	
	public boolean supports(Class<?> clazz) {
		return PersonalInfo.class.isAssignableFrom(clazz);

	}

	public void validate(Object target, Errors errors) {
		PersonalInfo registration =  (PersonalInfo) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "registration.email.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "registration.password.empty");
		
		
		if (!registration.getEmail().isEmpty() && registration.getEmail().trim().length() > 0)
			if (!emailValidation.emailValid(registration.getEmail()))
				errors.rejectValue("email", "registration.email.invalid");

		if (!registration.getPassword().isEmpty() && registration.getPassword().trim().length() > 0)
			if (!passwordValidation.passwordValid(registration.getPassword()))
				errors.rejectValue("password", "registration.password.invalid");
		
		
		
	

}
}
