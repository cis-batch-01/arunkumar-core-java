package workout;

import java.util.ArrayList;
import java.util.List;

public class TopicRepoImpl implements TopicsRepostory{
	public static List<Topics> castList = new ArrayList<Topics>();
	static {
		
			castList.add(new Topics(1, "Java", "Java SE", "Beginner"));
			castList.add(new Topics(2, "C", "C SE", "Beginner"));
			castList.add(new Topics(3, "C++", "C++ SE", "Beginner"));
			castList.add(new Topics(4, "HTML", "HTML SE", "Beginner"));
			castList.add(new Topics(5, "python", "python SE", "Beginner"));
			
			
		}  {
			
			System.out.println(" Date Format is worng");
		}

	public List<Topics> getallTopics() {
				return castList;
	}

	public Topics get(int id) {
		Topics resTop = null;
		for(Topics Top:castList)
			if(Top.getId().equals(Top)) {
		resTop=Top;
	}
		return resTop;
	}
	

	public boolean add(Topics Top) {
		return castList.add(Top);
	}

	public boolean remove(int id) {
		Topics Top=get(id);
		return castList.remove(Top);
	}

	public boolean update(int id) {
		Topics topic=get(id);
		castList.remove(topic);
		return castList.addAll(castList);
	}

}
