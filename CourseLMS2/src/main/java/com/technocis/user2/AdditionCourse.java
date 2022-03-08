package com.technocis.user2;

import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

import com.technocis.user.Course;
import com.technocis.user1.CourseRepo;
import com.technocis.user1.ListOfCourseImpl;

public class AdditionCourse {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	CourseRepo cou=new ListOfCourseImpl();
	System.out.println("Users Details");
	char choice = 'n';
		System.out.println("1.Get all Courses\n 2. sum of users\n 3. % wise topic Completed");// user enters the choice based on the topics provided
		System.out.println("select yourchoice");// choice received from user
		int option = Integer.parseInt(scan.nextLine());
		List<Course> courseList=cou.getAllCourses();
		switch (option) {
		case 1:// case1 get all courses
			System.out.println("users Details from the Stroage");
			if (!courseList.isEmpty()) {
				for (Course users : courseList)
					System.out.println(users);
			} else {
				System.out.println("the list is empty");
			}
			break;
		case 2://count of Users
			int count,otherusers;
			count = courseList.size();
			System.out.println("Total no of users:"+count);
		case 3://Duration of the Course
			
			
						
	}
	
}
}
