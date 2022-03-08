 package com.technocis.userList1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.technocis.userList.Course;

public class ListOfUsersImpl implements UserRepo {
static List<Course> courseList=new ArrayList<Course>();
static {
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	try {
	courseList.add(new Course(1, "Java", "j@gmail.com", 95486666L, sdf.parse("30:40"),sdf.parse("3:40") ,"100" ));
	courseList.add(new Course(2, "C", "c@gmail.com", 95486666L, sdf.parse("30:40"),sdf.parse("3:40") ,"100" ));
	courseList.add(new Course(3, "C++", "c++@gmail.com", 95486666L, sdf.parse("30:40"),sdf.parse("2:40") ,"100" ));
	courseList.add(new Course(4, "HTML", "hml@gmail.com", 95486666L, sdf.parse("30:40"),sdf.parse("3:40") ,"100" ));
	}catch(ParseException e) {
		System.out.println("data wrong");
	}
}

public boolean add(Course course) {
	
	return courseList.add(course);
}
public boolean remove(int id) {
	Course course=get(id);
	return courseList.remove(course);
}
public boolean update(int id, Course course) {
	courseList.remove(id -1);
	return courseList.add(course);
}
public List<Course> getAllCourse() {
		return courseList;
}
public Course get(int id) {
	Course resCourse=null;
	for(Course course:courseList) {
		if(course.getUserid().equals(course)) {
			resCourse=course;
		}
	}
	return null;
}
public Date get1(Date ctime) {
	
	return (Date) courseList;
}
public Date get(Date etime) {
	
	return (Date) courseList;
}
}
