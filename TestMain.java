package userexception1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TestMain {
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		List<User> userList=new ArrayList<User>();
		userList.add(new User("Java", "Beginner", "English", 4.5));
		userList.add(new User("C", "Beginner", "English", 4.5));
		userList.add(new User("C++", "Beginner", "English", 4.8));
		userList.add(new User("HTML", "Beginner", "English", 5.0));
		System.out.println("Enter the title ");
		String title=sca.nextLine();
		User resUser=null;
		for(User user:userList)
		{
			if(user.getName()==title)
			{
				resUser=user;
			}
		}try
		{
			if(resUser==null)
			{
				throw new TitleNotFoundException("user data  not found");
			}
		}
		catch(TitleNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println(resUser);
	}

}
