package com.technocis.user1;

import java.util.List;

import com.technocis.user.User;

public interface UserRepo {
	public boolean add(User user);
	public boolean remove(int id);
	public boolean update(int id, User user);
	public List<User> getAllUser();
	public User get(int id);

}
