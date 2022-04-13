package practice_project;

import java.util.regex.Pattern;

public class Validate_email {
	public static void main(String[] args) {
		String email1 = "firstname@gmail.com";
		String email2 = "sahananagaraj@gmail.com";
		String email3 = "test123prepare@co.edu.com";
	
		System.out.println("email1= "+ ValidateEmail(email1));
		System.out.println("email2= "+ ValidateEmail(email2));
		System.out.println("email3= "+ ValidateEmail(email3));		
	}

	public static String ValidateEmail(String email) {
		if (email ==null || email.isEmpty()) {
		return "not valid";
	}
		Pattern pattern;
		String emailRegex = "^[a-zA-Z0+_.-]+@[a-zA-Z0-9.-]+$";
		Pattern pattern1= Pattern.compile(emailRegex);
		if (pattern1.matcher(email).matches()) {
			return "valid";
		} else {
			return "invalid";
			
		}
}
}

