package com.technocis.User.model;

import java.util.Date;

public class Attendance {
private Integer Id;
private String UName;
private String status;
private String date;
private String IName;
public Integer getId() {
	return Id;
}
@Override
public String toString() {
	return "Attendance [Id=" + Id + ", UName=" + UName + ", status=" + status + ", date=" + date + ", IName=" + IName
			+ "]";
}

public Attendance(Integer id, String uName, String status, String date, String iName) {
	super();
	Id = id;
	UName = uName;
	this.status = status;
	this.date = date;
	IName = iName;
}
public Attendance() {
	super();
	// TODO Auto-generated constructor stub
}
public String getUName() {
	return UName;
}
public void setUName(String uName) {
	UName = uName;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getIName() {
	return IName;
}
public void setIName(String iName) {
	IName = iName;
}
public void setId(Integer id) {
	Id = id;
}




}
