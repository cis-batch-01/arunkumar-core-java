package com.technocis.userList2;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


import com.technocis.userList.Course;
import com.technocis.userList1.ListOfUsersImpl;
import com.technocis.userList1.UserRepo;

public class AdditionCourse {
private static Date ETime;

public static void main(String[] args) throws NumberFormatException, ParseException {
	Scanner scan=new Scanner(System.in);
	UserRepo use=new ListOfUsersImpl();
	System.out.println("Users Details");
	char choice='n';
	Long time;
	do {
		System.out.println("1.Get all Courses\n 2. Get a Courses\n 3. Add a Course\n4. remove Course\n 5. update course\n 6. sum of users\n 7. time record \n 8 .% to complete the Course");//user choice
		System.out.println("select yourchoice");//choice received from user
		int option=Integer.parseInt(scan.nextLine());
		List<Course> UsersList=use.getAllCourse();
		switch (option) {
		case 1:// case1 get all courses
			System.out.println("users Details from the Stroage");
			if (!UsersList.isEmpty()) {
				for (Course users : UsersList)
					System.out.println(users);
			} else {
				System.out.println("the list is empty");
			}
			break;
			
		case 2://case2 get a course using id
			System.out.println("enter the course id:");	
			int id=Integer.parseInt(scan.nextLine());
			Course users=use.get(id);
			System.out.println(users!=null?users:"id not found");
			break;
		case 3://case3:add a new course
			System.out.println("enter the course details:");
			String data=scan.nextLine();
			Course usersnew=Course.createCast(data);
			boolean res=UsersList.add(usersnew);
			System.out.println(res?"Users Added successfully":"storage is full");
			break;
		case 4://remove course
			System.out.println("Enter the id to be removed");
			int id1 =Integer.parseInt(scan.nextLine());
			System.out.println(UsersList.remove(id1) != null?"Removed successfully":"not removed");
			break;
		case 5://update course
			System.out.println("enter the id to be updated");
			int updateid=Integer.parseInt(scan.nextLine());
			System.out.println("enter the Users Details");
			String update=scan.nextLine();
			List<Course> updateUsers=UsersList ;
			boolean result=false;
		System.out.println(result?updateid:"not get updated");
			break;
		case 6:
			
			int count,otherusers;
			count = UsersList.size();
			System.out.println("Total no of users:"+count);
			break;
			}System.out.println("Do you want to continue (y/n)");
			choice = scan.nextLine().charAt(0);
}while (choice == 'y');
}
}
