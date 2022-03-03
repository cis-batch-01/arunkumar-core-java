package workout;

import java.util.List;

public  interface TopicsRepostory {
	public  List<Topics> getallTopics();
	public Topics get(int id);
	public boolean add(Topics Top);
	public boolean remove(int id);
	public boolean update(int id);

}
