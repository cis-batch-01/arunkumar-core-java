package com.technocis.userList.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.technocis.userList.exception.CourseNotFoundException;
import com.technocis.userList.exception.UserNotFoundException;
import com.technocis.userList.model.Course;
import com.technocis.userList.model.repo.UserRepo;
import com.technocis.userList.model.repoimpl.ListOfUsersImpl;

public class AdditionCourse {
	private static Course[] courseList;
	private static LocalDate Localdate;

	public static void main(String[] args) throws NumberFormatException, ParseException {
		Scanner scan = new Scanner(System.in);
		UserRepo use = new ListOfUsersImpl();
		System.out.println("welcome User");
		char choice = 'n';

		ListOfUsersImpl courseImpl = new ListOfUsersImpl();

		System.out.println("Login time :");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date now = new Date();
		System.out.println(sdf.format(now));
		Course selectedCourse = null;
		do {
			
			System.out.println(
					" 1.List of all Courses\n 2. fetch  a Courses from id\n 3. Add a Course\n 4. delete Course\n 5. edit course\n 6. sum of viewed users\n 7. time remaning to complete the course \n 8. percentage to complete the remaning Course");// user
			// choice
			System.out.println("select yourchoice");// choice received from user
			int option = Integer.parseInt(scan.nextLine());
			List<Course> UsersList = use.getAllCourse();
			switch (option) {
			case 1:// case1 get all courses
				System.out.println("welcome User");
				System.out.println("courses Details from the Stroage");
				if (!UsersList.isEmpty()) {
					System.out.format("%-15s%-15s%-15s%-15s%-20s%-35s%-25s\n","userid","userName","userEmail","phoneNumber","CTime","ETime","percentage");
					for (Course course : UsersList) {
						System.out.println(course);
					}
				} else {
					System.out.println("the list is empty");
				}
				break;

			case 2:// case2 get a course using id
				System.out.println("welcome User");
				System.out.println("enter the course id:");
				int id = Integer.parseInt(scan.nextLine());
				Course users = use.get(id);
				System.out.format("%-25s%-25s%-25s%-25s%-25s%-25s%-25s\n","userid","userName","userEmail","phoneNumber","CTime","ETime","percentage");
				System.out.println(users != null ? users : "id not found");
				break;
			case 3:// case3:add a new course
				System.out.println("enter the course details:");
				System.out.println("This details are entered by the user(CouseId, CourseName, CourseEmail,Course contact,total timeof the course,end time of the course,percentage");
				String data = scan.nextLine();
				Course usersnew = Course.createCast(data);
				boolean res = UsersList.add(usersnew);
				
				System.out.println(res ? "Users Added successfully" : "storage is full");
				break;
			case 4:// remove course
				System.out.println("Enter the id to be removed");
				int id1 = Integer.parseInt(scan.nextLine());
				System.out.println(UsersList.remove(id1) != null ? "Removed successfully" : "not removed");
				break;
			case 5:// update course
				System.out.println("enter the id to be updated");
				int updateid = Integer.parseInt(scan.nextLine());
				System.out.println("This details are entered by the user(CouseId, CourseName, CourseEmail,Course contact,total timeof the course,end time of the course,percentage");
				System.out.println("enter the Course Details");
				//Course updatedcourse=course;
				boolean result = false;
				System.out.println(result ? updateid : "not get updated");
				break;
			case 6://Total no of users in the list
				System.out.println("welcome User");
				int count;
				count = UsersList.size();
				System.out.println("Total no of Viewed  users:" + count);
				break;

			case 7://time remaining
				System.out.println("welcome User");
				System.out.println("Enter the course Id");
				int cId = Integer.parseInt(scan.nextLine());
				selectedCourse = courseImpl.get(cId);
				long timediff = selectedCourse.getETime().getTime() - selectedCourse.getCTime().getTime();
				System.out.println("total time in milliseconds :" + timediff);
				int hours = (int) (timediff / 1000 * 60 * 60) % 24;
				System.out.println("total time in hours: " + hours);
				break;
			case 8://% time to completed the course
				System.out.println("welcome User");
				System.out.println("Total no of Topics completed :100");
				System.out.println("Enter the user Id");
				int uId = Integer.parseInt(scan.nextLine());
				try {
				if(use.get(uId)==null) {
					throw new UserNotFoundException("please check your id");
				}
				}
				catch(Exception e) {
					System.out.println(e);
				}
				System.out.println("Enter the course Id");
				int cId1 = Integer.parseInt(scan.nextLine());
				try {
					if(use.get(cId1)==null) {
						throw new CourseNotFoundException("please check your id");
					}
					}
					catch(Exception e) {
						System.out.println(e);
					}
				if(use.get(cId1).getUserid() != null	)			{
					
				
				long per = now.getTime() - selectedCourse.getETime().getTime();
				long per1 = selectedCourse.getCTime().getTime() - selectedCourse.getETime().getTime();
				long per2 = ((per / per1) * 100);
				System.out.println("the estimated time to complete the course is:" + per2);
				break;

			}
			System.out.println("Do you want to continue (y/n)");
			choice = scan.nextLine().charAt(0);
		}
		}while (choice == 'y');
		
}
}
