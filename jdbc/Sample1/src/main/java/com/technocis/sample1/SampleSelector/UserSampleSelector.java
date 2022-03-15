package com.technocis.sample1.SampleSelector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserSampleSelector {
	public static void main(String[] args) throws ClassNotFoundException {
		
		String url="jdbc:mysql://localhost:3306/ams";    
		String uName="root";
		String pass="root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			Connection com=DriverManager.getConnection(url, uName, pass);
			Statement stmt=com.createStatement();
			ResultSet rs=stmt.executeQuery("select * from user");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" "+rs.getString(2));
			}
					} catch (SQLException e) {
						e.printStackTrace();
										}
		
		
	}

}
