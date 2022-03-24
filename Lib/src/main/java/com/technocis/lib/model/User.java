package com.technocis.lib.model;

import java.util.Date;

public class User {
	private Integer id;
	private String name;
	private Date dob;
	private String email;
	private String password;
	private long phoneNumber;
	private String address;
	private Date jDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getjDate() {
		return jDate;
	}

	public void setjDate(Date jDate) {
		this.jDate = jDate;
	}

	public User(Integer id, String name, Date dob, String email, String password, long phoneNumber, String address,
			Date jDate) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.jDate = jDate;
	}
	

	public User(String name, Date dob, String email, String password, long phoneNumber, String address, Date jDate) {
		super();
		this.name = name;
		this.dob = dob;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.jDate = jDate;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", dob=" + dob + ", email=" + email + ", password=" + password
				+ ", phoneNumber=" + phoneNumber + ", address=" + address + ", jDate=" + jDate + "]";
	}

}
