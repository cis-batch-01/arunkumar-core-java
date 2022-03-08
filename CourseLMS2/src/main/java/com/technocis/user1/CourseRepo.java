package com.technocis.user1;

import java.sql.Date;
import java.util.List;
import com.technocis.user.Course;
public interface CourseRepo {
	public boolean add(Course course);
	public boolean remove(int id);
	public boolean update(int id, Course course);
	public List<Course> getAllCourses();
	public Course get(int id);
	
	}
