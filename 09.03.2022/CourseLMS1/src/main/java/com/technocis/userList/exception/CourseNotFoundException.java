package com.technocis.userList.exception;

public class CourseNotFoundException extends RuntimeException {
	String message;
	
	public CourseNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

}
