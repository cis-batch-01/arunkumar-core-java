package com.technocis.UserList1;

import java.util.ArrayList;
import java.util.List;

import com.technocis.UserList.ListOfUsers;

public class ListOfUsersImpl implements UserRepo {
	static List<ListOfUsers> usersList=new ArrayList<ListOfUsers>();
	static {
		usersList.add(new ListOfUsers(1,"Arun","arun@gmail.com",52654644L));
		usersList.add(new ListOfUsers(2,"kumar","kumar@gmail.com",54545654644L));
		usersList.add(new ListOfUsers(3,"raj","raj@gmail.com",5211515654644L));
	}
	public boolean add(ListOfUsers users) {
		
		return usersList.add(users) ;
	}
	public boolean remove(int id) {
		ListOfUsers users=get(id);
		return usersList.remove(users);
	}
	public boolean update(int id, ListOfUsers users) {
		
	usersList.remove(id);
		return usersList.add(users);
	}
	public List<ListOfUsers> getAllListOfUsers() {
		
		return usersList;
	}
	public ListOfUsers get(int id) {
		ListOfUsers resList=null;
		for(ListOfUsers listofusers: usersList)
		{
			if(listofusers.getUserid()==id)
{
	
				resList=listofusers;
}
		}
		return resList;
	}

}
