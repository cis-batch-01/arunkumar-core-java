package com.technocis.userList.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Course{
	private Integer userid;
	private String userName;
	private String userEmail;
	private Long phoneNumber;
	private Date CTime;
	private Date ETime;
	private String  percentage;
	@Override
	public String toString() {
		return String.format("%-15s%-15s%-15s%-15s%-35s%-50s%-50s\n",userid,userName,userEmail,phoneNumber,CTime,ETime,percentage);
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getCTime() {
		return CTime;
	}
	public void setCTime(Date cTime) {
		CTime = cTime;
	}
	public Date getETime() {
		return ETime;
	}
	public void setETime(Date eTime) {
		ETime = eTime;
	}
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	public Course(Integer userid, String userName, String userEmail, Long phoneNumber, Date cTime, Date eTime,
			String percentage) {
		super();
		this.userid = userid;
		this.userName = userName;
		this.userEmail = userEmail;
		this.phoneNumber = phoneNumber;
		CTime = cTime;
		ETime = eTime;
		this.percentage = percentage;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static Course createCast(String data) throws NumberFormatException, ParseException 
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		String[] splitted=data.split(",");
		Course course=new Course(Integer.parseInt(splitted[0]), splitted[1], splitted[2], Long.parseLong(splitted[3]), sdf.parse(splitted[4]), sdf.parse(splitted[5]), splitted[6]);
		return course;
	}
	
}
