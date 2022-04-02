package com.technocis.author.ConnectionUtill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionUtill {
	public static Connection getDbConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://101.53.133.59/technocis_training_db", "cis_user",
					"cis_user");
			System.out.println("connection established");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return con;

	}

}
