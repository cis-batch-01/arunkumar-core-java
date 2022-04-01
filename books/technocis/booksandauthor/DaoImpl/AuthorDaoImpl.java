package com.technocis.booksandauthor.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.technocis.booksandauthor.Dao.AuthorDao;
import com.technocis.booksandauthor.Dao.ConnectionUtill;
import com.technocis.booksandauthor.model.Author;

public class AuthorDaoImpl implements AuthorDao {
	public static final String SELECTALLAUTHOR="select author_id,name,descripttion,gender,first_book_released_date from Author";
	public static final String INSERTAUTHOR="insert into Author(author_id,name,descripttion,gender,first_book_released_date)values(?,?,?,?,?)";
	public static final String SELECTALLAUTHORBooks="select Author.author_id,Author.name,Author.description,Author.gender,Author.first_book_released_date from books join book_author on books.book_id=book_author.book_id join Author on book_author.Author_id=Author.author_id	where books.book_id='?'";
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy HH:mm:SS");

	public List<Author> getallAuthor() {
		List<Author>authorList=new ArrayList<Author>();
		Connection con=ConnectionUtill.getDBConnect();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
		 pstmt=con.prepareStatement(SELECTALLAUTHOR);
		 rs=pstmt.executeQuery();
		 while(rs.next())
		 {
			 authorList.add(new Author(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), null));
		 }
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		try {
			rs.close();
			pstmt.close();
			con.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return authorList;
	}

	public Author InsertBook(int id) {
		
		return null;
	}
	public List<Author>getAllAuthorBook(int booksid){
		List<Author>AuthrList=new ArrayList<Author>();
		Connection con=ConnectionUtill.getDBConnect();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
		 pstmt=con.prepareStatement(SELECTALLAUTHOR);
		 rs=pstmt.executeQuery();
		 while(rs.next())
		 {
			 AuthrList.add(new Author(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), null));
		 }
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		try {
			rs.close();
			pstmt.close();
			con.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return AuthrList;
			
		
	}

}
