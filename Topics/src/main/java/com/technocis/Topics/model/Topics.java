package com.technocis.Topics.model;

public class Topics {
public int id;
public String Name;
public String Chapter;
public String desc;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getChapter() {
	return Chapter;
}
public void setChapter(String chapter) {
	Chapter = chapter;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}

public Topics(String name, String chapter, String desc) {
	super();
	Name = name;
	Chapter = chapter;
	this.desc = desc;
}

public Topics(int id, String name, String chapter, String desc) {
	super();
	this.id = id;
	Name = name;
	Chapter = chapter;
	this.desc = desc;
}
public Topics() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "\n Id=" + id + "\n Name=" + Name + "\n Chapter=" + Chapter + "\n Desc=" + desc + "]";
}

}
