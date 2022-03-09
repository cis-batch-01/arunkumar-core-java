package com.technocis.userList.model.repo;

import java.util.Date;
import java.util.List;

import com.technocis.userList.model.Course;

public interface UserRepo {
    public boolean add(Course course);
    public boolean remove(int id);
    public boolean update(int id, Course course);
    public List<Course> getAllCourse();
    public Course get(int id);
   
}
