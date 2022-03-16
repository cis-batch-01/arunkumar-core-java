package com.technocis.Topics.services;

import java.util.List;

import com.technocis.Topics.model.Topics;

public interface TopicsService {
	//1. get Topics
	public Topics getTopics(int id);
	//2. get all Topics
	public List<Topics> getallTopics();
	//3.Insert Topics
	public Topics insertTopics(Topics topics);
	//4. update Topics
	public Topics updateTopics(int id,Topics topics);
	//5. Delete Topics
	public Topics deleteTopics(int id);

}
