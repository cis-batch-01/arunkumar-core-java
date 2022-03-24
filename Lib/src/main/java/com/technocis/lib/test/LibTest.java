package com.technocis.lib.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import com.technocis.lib.model.User;
import com.technocis.lib.model.daoImpl.UserDAOImpl;

public class LibTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char option = 'n';
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		do {
			System.out.println("1.GetAllUser\n2.GetUser\n3.InsertUser\n4.UpdateUser\n5.DeleteUser");
			int Id = Integer.parseInt(scan.nextLine());
			UserDAOImpl userDao = new UserDAOImpl();

			switch (option) {
			case 1:
				List<User> resUser = userDao.getAllUser();
				for (User user : resUser) {
					System.out.println(user);
				}
				break;
			case 2:
				System.out.println("Please enter the id to fetch the User details :");
				Id = Integer.parseInt(scan.nextLine());
				User user = userDao.getUser(Id);
				System.out.println(user);
				break;
			case 3:
				System.out.println("enter the User details");
				String details = scan.nextLine();
				String datas[] = details.split(",");
				try {
					user = new User(datas[0], sdf.parse(datas[1]), datas[2], datas[3], Long.parseLong(datas[4]),
							datas[5], sdf.parse(datas[6]));
					User inserteduser = userDao.insertUser(user);
					System.out.println(inserteduser != null ? "insertion completed" : "insertion not completed");
					System.out.println(inserteduser);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				break;
			case 4:
				System.out.println("enter the id to update the User details");
				int updateid = Integer.parseInt(scan.nextLine());
				User oldAttendance = userDao.getUser(Id);
				System.out.println(oldAttendance);
				System.out.println("enter the User details");
				String details1 = scan.nextLine();
				String datas1[] = details1.split(",");
				try {
					user = new User(datas1[0], sdf.parse(datas1[1]), datas1[2], datas1[3], Long.parseLong(datas1[4]),
							datas1[5], sdf.parse(datas1[6]));
					User updateduser = userDao.insertUser(user);
					System.out.println(updateduser != null ? "updation completed " : "updation not completed");
					System.out.println(updateduser);
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
			case 5:
				System.out.println("enter the id to detete the attendance details");
				int deleteid = Integer.parseInt(scan.nextLine());
				User deletuser = userDao.deleteUser(Id);
				System.out.println(deletuser);
				System.out.println(deletuser != null ? "deletion completed " : "deletion not completed");
				break;
			default:
				System.out.println("Invalid choice");
				break;

			}
			System.out.println("Do you want to continue(y or n)");
			option = scan.nextLine().charAt(0);
		} while (option == 'y');

	}
}
