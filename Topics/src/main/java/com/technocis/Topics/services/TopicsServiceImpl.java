package com.technocis.Topics.services;

import java.util.List;

import com.technocis.Topics.model.Topics;
import com.technocis.Topics.model.TopicsDAO.TopicsDAO;
import com.technocis.Topics.model.TopicsDAO.TopicsDAOImpl;

public class TopicsServiceImpl implements TopicsService {
	static TopicsDAO topicsDao=new TopicsDAOImpl();
	public Topics getTopics(int id) {
	return topicsDao.getTopics(id);			
	}

	public List<Topics> getallTopics() {
		
		return topicsDao.getallTopics();
	}

	public Topics insertTopics(Topics topics) {
		
		return topicsDao.insertTopics(topics);
	}

	public Topics updateTopics(int id, Topics topics) {
		
		return topicsDao.updateTopics(id, topics);
	}

	public Topics deleteTopics(int id) {
		
		return topicsDao.deleteTopics(id);
	}
	}



