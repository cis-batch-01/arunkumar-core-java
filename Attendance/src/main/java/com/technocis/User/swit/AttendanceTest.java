package com.technocis.User.swit;

import java.util.List;
import java.util.Scanner;

import com.technocis.User.DAO.AttendanceDAOImpl;
import com.technocis.User.model.Attendance;

public class AttendanceTest {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int option=Integer.parseInt(scan.nextLine());
		char option1='n';
		do {
			System.out.println("1.SelectallAttendance\n 2.Select Attendance \n 3. InsertAttendance\n 4.updateAttendance\n 5. delete Attendance");
			int choice=Integer.parseInt(scan.nextLine());
			AttendanceDAOImpl attendanceDao=new AttendanceDAOImpl();
			switch(choice) 
			{
			case 1:
				System.out.println("enter the id to fetch the details of Attendance");
				int id=Integer.parseInt(scan.nextLine());
				Attendance attendance=attendanceDao.getAttendance(id);
				System.out.println(attendance);
				break;
			case 2:
				List<Attendance>resAttendance=attendanceDao.getAllAttendance();
				for(Attendance Attendance:resAttendance)
				break;
				default:
					System.out.println("Invalid choice");
					break;
			}
			
			
			
			
		}while(option1=='y');
		System.out.println("Do you want to continue(y or n)");
		int id=Integer.parseInt(scan.nextLine());
	}


}
