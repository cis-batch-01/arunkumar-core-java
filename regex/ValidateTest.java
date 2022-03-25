package com.technocis.lib.regex;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class ValidateTest {
	public static void main(String[] args)  {
Scanner scan = new Scanner(System.in);
SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	String name=null;
	String email=null;
	String password=null;
	String Address=null;
	Long phonenumber=null;
	String address=null;
	Date DOB=null;
	do {
	System.out.println("Enter your Name to validate");
	name=scan.nextLine();
	System.out.println(!Validator.validateName(name)?"Valid":"NotValid");
	}while(Validator.validateName(name));
	do {
		System.out.println("Enter your email to validate");
		email=scan.nextLine();
		System.out.println(!Validator.validateEmail(email)?"Valid":"NotValid");
		}while(Validator.validateEmail(email));
	do {
		System.out.println("Enter your password to validate");
		password=scan.nextLine();
		System.out.println(!Validator.validatepassword(password)?"Valid":"NotValid");
		}while(Validator.validatepassword(password));
	do {
		System.out.println("Enter your phonenumber to validate");
		phonenumber=Long.parseLong(scan.nextLine());
		System.out.println(!Validator.validatePhonenumber(phonenumber)?"Valid":"NotValid");
		}while(Validator.validatePhonenumber(phonenumber));
	
	}
}
	