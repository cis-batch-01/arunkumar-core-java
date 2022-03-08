package com.technocis.user1;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.technocis.user.Course;
import com.technocis.user.User;

public class ListOfUsersImpl implements UserRepo {
	static
	List<User> userList=new ArrayList<User>();
	static
	{
		SimpleDateFormat sdf = new SimpleDateFormat("mm:ss");
		try {
			userList.add(new User(1, "arun", "arun@gmail.com"));
			userList.add(new User(2, "kumar", "kumar@gmail.com"));
			userList.add(new User(3, "logo", "logo@gmail.com"));
		}catch(Exception e) {
			System.out.println("data wrong");
		}
	}
			public boolean add(User user) {
			return userList.add(user);
	}

	public boolean remove(int id) {
		User user=get(id);
		return userList.remove(user);
	}

	public boolean update(int id, User user) {
		userList.remove(id);
		return userList.add(user);
	}

	public List<User> getAllUser() {
		
		return userList;
	}

	public User get(int id) {
		User resuser=null;
		for(User course:userList) {
			if(this.userList.get(id).equals(resuser)) {
				resuser=(User) userList;
			}
		}
		
		return null;
	}

}
