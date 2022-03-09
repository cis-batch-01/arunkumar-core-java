 package com.technocis.userList.model.repoimpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.technocis.userList.model.Course;
import com.technocis.userList.model.repo.UserRepo;

public class ListOfUsersImpl implements UserRepo {
static List<Course> courseList=new ArrayList<Course>();
static {
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	try {
	courseList.add(new Course(1, "Java", "j@gmail.com", 95486666L, sdf.parse("30-04-2020"),sdf.parse("30-05-2020") ,"100" ));
	courseList.add(new Course(2, "C", "c@gmail.com", 95486666L, sdf.parse("05-06-2020"),sdf.parse("05-08-2020") ,"100" ));
	courseList.add(new Course(3, "C++", "c++@gmail.com", 95486666L, sdf.parse("07-08-2020"),sdf.parse("07-09-2020") ,"100" ));
	courseList.add(new Course(4, "HTML", "hml@gmail.com", 95486666L, sdf.parse("09-10-2020"),sdf.parse("09-12-2020") ,"100" ));
	}catch(ParseException e) {
		e.printStackTrace();
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
	courseList.remove(get(id));
	return courseList.add(course);
}
public List<Course> getAllCourse() {
			return courseList;
}
public Course get(int id) {
	Course resCourse=null;
	for(Course course:courseList) {
		if(course.getUserid().equals(id)) {
			resCourse=course;
		}
	}
	return resCourse;
}


}
