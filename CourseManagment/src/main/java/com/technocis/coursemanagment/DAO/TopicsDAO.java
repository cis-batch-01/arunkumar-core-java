package com.technocis.coursemanagment.DAO;
import java.util.List;
import com.technocis.coursemanagment.model.Topics;
public interface TopicsDAO {
	//get Topics
		public Topics getTopics(int id);
		//get All Topics
		public List<Topics>getallTopics();
		//insert Topics
		public Topics insertTopics(Topics topics);
		//update Question
		public Topics updateTopics(int id,Topics topics);
		//delete Question
		public Topics deleteTopics(int id);
}
