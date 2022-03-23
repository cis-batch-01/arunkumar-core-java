package com.technocis.Library.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class BookTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				System.out.println("Please Enter the Basic Details Like This\n 1.Name,\n2.Description\n3.PublisherName,\n4.PublishDate,\n5.Price");
		System.out.println("Enter the book details");
		String details = scan.nextLine();
		String insertedbook[] = details.split(",");
		try {
			Book book = new Book(insertedbook[0], insertedbook[1], insertedbook[2], sdf.parse(insertedbook[3]),
					Double.parseDouble(insertedbook[4]));
			Book book1 = BookTest.insertBook(book);

			System.out.println(book1 != null ? "inserted book Successfully" : "book not inserted");
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	public static Connection getDBConnect() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ams", "root", "root");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public static Book insertBook(Book book) {
		Connection con = getDBConnect();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			PreparedStatement pstmt = con.prepareStatement(
					" insert into books( Name,description,publisher_Name,publish_Date,price)values(?,?,?,?,?)");
			pstmt.setString(1, book.getName());
			pstmt.setString(2, book.getDescription());
			pstmt.setString(3, book.getPublisherName());
			pstmt.setDate(4, new java.sql.Date(book.getPublihDate().getTime()));
			pstmt.setDouble(5, book.getPrice());
			int rs = pstmt.executeUpdate();
			if (rs > 0) {
				return book;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
