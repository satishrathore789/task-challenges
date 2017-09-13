package com.beyondtalent.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

@Component
public class PasswordValidation {
	 private Pattern pattern;
	  private Matcher matcher;

	  private static final String PASSWORD_PATTERN =
             "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,48})";

	  public PasswordValidation(){
		  pattern = Pattern.compile(PASSWORD_PATTERN);
	  }

	  /**
	   * Validate password with regular expression
	   * @param password password for validation
	   * @return true valid password, false invalid password
	   */
	  public boolean passwordValid(final String password){

		  matcher = pattern.matcher(password);
		  return matcher.matches();

	  }
}

