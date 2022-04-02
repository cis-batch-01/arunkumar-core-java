package com.technocis.author.Test;

import java.sql.Connection;

import com.technocis.author.ConnectionUtill.ConectionUtill;

public class ConnectionTest {
	public static void main(String[] args) {
		Connection con = ConectionUtill.getDbConnection();
	}

}
