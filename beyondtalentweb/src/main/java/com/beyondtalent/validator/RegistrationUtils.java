package com.beyondtalent.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;


@Component
public class RegistrationUtils {
	
	private Pattern pattern;
	private Matcher matcher;
	
	
	private static final String USER_NAME="[a-zA-Z]{2,36}";
	
 public  RegistrationUtils()
 {
	 pattern=Pattern.compile(USER_NAME);
 }
	
 public boolean valid(final String userName)
 {
 
   matcher=pattern.matcher(userName);
    return matcher.matches();
 
}
 
}