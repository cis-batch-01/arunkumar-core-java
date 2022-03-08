package com.technocis.user1;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.technocis.user.Course;

public class ListOfCourseImpl implements CourseRepo{
	static
	List<Course> courseList=new ArrayList<Course>();
	static
	{
		SimpleDateFormat sdf = new SimpleDateFormat("mm:ss");
		try {
			courseList.add(new Course(1, "Java", "Java EE", "Beginners", "English", sdf.parse("30:20"),sdf.parse("00:00") ));
			courseList.add(new Course(2, "C", "C EE", "Beginners", "English", sdf.parse("60:20"),sdf.parse("00:00") ));
			courseList.add(new Course(3, "C++", "C++EE", "Beginners", "English", sdf.parse("90:20"),sdf.parse("00:00") ));
			courseList.add(new Course(4, "HTML", "HTML EE", "Beginners", "English", sdf.parse("120:20"),sdf.parse("00:00") ));
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
	public boolean update(Course course){
		courseList.remove(course);
		return courseList.add(course);
	}
	public List<Course> getAllCourses() {
		
		return courseList;
	}
	public Course get(int id) {
		Course resCourse=null;
		for(Course course:courseList) {
			if(this.courseList.get(id).equals(course)) {
				resCourse=course;
			}
		}
		return resCourse;
	}
		
	public boolean update(int id, Course course) {
		// TODO Auto-generated method stub
		return false;
	}
			
		
	}


