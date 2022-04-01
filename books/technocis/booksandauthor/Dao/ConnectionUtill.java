package com.technocis.booksandauthor.Dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtill {
	public static Connection getDBConnect(){
		Connection con = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		con=(Connection) DriverManager.getConnection("jdbc:mysql://101.53.133.59/technocis_training_db", "cis_user", "cis_user");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;


		
		}

}
