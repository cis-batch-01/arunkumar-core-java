package com.technocis.UserList1;

import java.util.List;

import com.technocis.UserList.ListOfUsers;

public interface UserRepo {
	public boolean add(ListOfUsers users);
	public boolean remove(int id);
	public boolean update(int id, ListOfUsers users);
	public List<ListOfUsers> getAllListOfUsers();
	public ListOfUsers get(int id);
	}
