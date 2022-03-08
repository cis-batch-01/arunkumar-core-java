package com.technocis.user;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Course {
public int id;
public String name;
public String descprition;
public String skilllevel;
public String language;
public Date duration;
public Date STime;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescprition() {
	return descprition;
}
public void setDescprition(String descprition) {
	this.descprition = descprition;
}
public String getSkilllevel() {
	return skilllevel;
}
public void setSkilllevel(String skilllevel) {
	this.skilllevel = skilllevel;
}
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}
public Date getDuration() {
	return duration;
}
public void setDuration(Date duration) {
	this.duration = duration;
}
public Date getSTime() {
	return STime;
}
public void setSTime(Date sTime) {
	STime = sTime;
}
public Course(int id, String name, String descprition, String skilllevel, String language, Date duration, Date sTime) {
	super();
	this.id = id;
	this.name = name;
	this.descprition = descprition;
	this.skilllevel = skilllevel;
	this.language = language;
	this.duration = duration;
	STime = sTime;
}
public Course() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Id=" + id + " \nName=" + name + "\nDescprition=" + descprition + "\nSkilllevel=" + skilllevel
			+ "\nLanguage=" + language + "\nDuration=" + duration + "\nSTime=" + STime + "]";
}
public static Course createUsers(String data) throws NumberFormatException, ParseException {
	SimpleDateFormat sdf=new SimpleDateFormat("mm:ss");
	String[] splitted=data.split(",");
	Course course=new Course(Integer.parseInt(splitted[0]), splitted[1], splitted[2], splitted[3], splitted[4], sdf.parse(splitted[5]), sdf.parse(splitted[6])); 
	
	return null;
}
public boolean isEmpty() {
	
	return false;
}
}
