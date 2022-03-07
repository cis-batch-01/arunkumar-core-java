package com.technocis.UserList;
public class ListOfUsers {
	
	private Integer userid;
	private String userName;
	private String userEmail;
	private Long phoneNumber;
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public ListOfUsers(Integer userid, String userName, String userEmail, Long phoneNumber) {
		super();
		this.userid = userid;
		this.userName = userName;
		this.userEmail = userEmail;
		this.phoneNumber = phoneNumber;
	}
	public ListOfUsers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "ListOfUsers [userid=" + userid + ", userName=" + userName + ", userEmail=" + userEmail
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	public static ListOfUsers createUsers(String stringdata) throws NumberFormatException{
		String [] data=stringdata.split(",");
				ListOfUsers listofusers=new ListOfUsers(Integer.parseInt(data[0]),data[1],data[2],Long.parseLong(data[3]));
				return listofusers ;
	
	}
	
	
	

}
