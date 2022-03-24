package com.technocis.lib.model.dao;

import java.util.List;

import com.technocis.lib.model.User;

public interface UserDAO {
public List<User> getAllUser();
public User getUser(int id);
public User insertUser(User user);
public User updateUser(int id, User user);
public User deleteUser(int id);
}
