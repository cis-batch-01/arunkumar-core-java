package userexception1;

public class TitleNotFoundException extends RuntimeException {

	String message;
	


public TitleNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage(){
		return message;
	}
	
		
	}

