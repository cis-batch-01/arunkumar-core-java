package com.technocis.lib.regex;

import java.util.Date;
import java.util.regex.Pattern;

public class Validator {
	public static boolean validateName(String name) {
		return Pattern.matches("[A-Z]{1}[a-z]", name);
	}

	public static boolean validateEmail(String email) {
		return Pattern.matches("[a-z0-9]+[@][a-z]+[.][a-z]{2,3}",email);
	}

	public static boolean validatepassword(String password) {
		return Pattern.matches("(?=.[a-z])(?=.[A-Z])(?=.[0-9])(?=.[\\-_!@#$%^&*]).{8,}", password);
	}

	public static boolean validateDOB(Date DOB) {
		return Pattern.matches("^(1[0-2]|0[1-9])/(3[01]+ |[12][0-9]|0[1-9])/[0-9]{4}$", (CharSequence) DOB);
	}

	public static boolean validatePhonenumber(long phoneNumber) {
		String temp = Long.toString(phoneNumber);
		System.out.println(Pattern.matches("[6-9][0-9]{9}", temp));
		return false;
	}

	public static boolean validateAddress(String Address) {
		return Pattern.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)", Address);
	}

	public static boolean validatejDate(Date jdate) {
		return Pattern.matches("^(1[0-2]|0[1-9])/(3[01]+ |[12][0-9]|0[1-9])/[0-9]{4}$", (CharSequence) jdate);
	}
	//(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8, }"
}
