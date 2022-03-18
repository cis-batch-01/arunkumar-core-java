package com.technocis.coursemanagment.model;

public class Question {


private Integer id;
private String Name;
private Integer Cid;
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
public Integer getCid() {
	return Cid;
}
public void setCid(Integer cid) {
	Cid = cid;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
public Question(Integer id, String name, Integer cid, String desc) {
	super();
	this.id = id;
	Name = name;
	Cid = cid;
	this.desc = desc;
}
public Question() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Question [id=" + id + ", Name=" + Name + ", Cid=" + Cid + ", desc=" + desc + "]";
}
public Question(String name, Integer cid, String desc) {
	super();
	Name = name;
	Cid = cid;
	this.desc = desc;
}

}
