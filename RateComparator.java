package comprator;
import java.util.Comparator;

public class RateComparator implements Comparator<Course> {

	public int compare(Course o1, Course o2) {
		
		if(o1.getRating()==o2.getRating())
		{
		return 0;
		}
		else if(o1.getRating()<o2.getRating())
		{
			return 1;
		}
		else {
			return 1;
		}
		
	}

}