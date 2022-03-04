package workout;

public class TopicsNotFoundExcep extends Exception {
 String message;
 public TopicsNotFoundExcep(String message) {
	 super();
	 this.message=message;
	 
 }
@Override
public String getMessage() {
	
	return this.message;
}
 
}
