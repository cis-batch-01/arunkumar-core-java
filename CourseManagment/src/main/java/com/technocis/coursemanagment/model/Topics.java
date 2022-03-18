package com.technocis.coursemanagment.model;

public class Topics {
	private Integer id;
	private String Name;
	private String Topic;
	private String desc;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getTopic() {
		return Topic;
	}
	public void setTopic(String topic) {
		Topic = topic;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Topics(Integer id, String name, String topic, String desc) {
		super();
		this.id = id;
		Name = name;
		Topic = topic;
		this.desc = desc;
	}
	public Topics() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
