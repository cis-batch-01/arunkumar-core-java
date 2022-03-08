package com.technocis.user;

import java.sql.Date;

public class User {
public int id;
public String name;
public String email;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public User(int id, String name, String email) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
}




}
