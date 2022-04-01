package com.technocis.booksandauthor.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.technocis.booksandauthor.Dao.BooksDao;
import com.technocis.booksandauthor.Dao.ConnectionUtill;
import com.technocis.booksandauthor.model.Books;

public class BooksDaoImpl implements BooksDao {
	public static final String SELECTALLBOOKS="select book_id,title,description,publication,published_date,price from books";
	public static final String INSERTBOOKS="insert intobooks(Book_id,title,description,publication,published_date,price) values(?,?,?,?,?,?)";
	public static final String BOOKSAUTHOR="select books.book_id,books.title,books.description,books.published_date,books.publication,books.price from books join book_author on \r\n"
			+ "  books.book_id=book_author.book_id\r\n"
			+ "  join Author on book_author.Author_id=Author.author_id where Author.Author_id='?'";
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");


	public List<Books> getallBooks() {
		List<Books>bookList=new ArrayList<Books>();
		Connection con=ConnectionUtill.getDBConnect();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			 pstmt=con.prepareStatement(SELECTALLBOOKS);
			rs=pstmt.executeQuery();
			while(rs.next())
			{
				bookList.add(new Books(rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4), rs.getDate(5),rs.getDouble(6), null));
			}
		}catch(SQLException e) {
			e.printStackTrace();
					}
		
		return bookList;
	}

	public List<Books> InsertBook(Books authorid) {
		List<Books>booksList=new ArrayList<Books>();
		Connection con=ConnectionUtill.getDBConnect();
		
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			 pstmt=con.prepareStatement(BOOKSAUTHOR);
			 rs.getInt(1);
			rs=pstmt.executeQuery();
			while(rs.next())
			{
				booksList.add(new Books(rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4), rs.getDate(5),rs.getDouble(6), null));
			}
		}catch(SQLException e) {
			e.printStackTrace();
					}
		
		return booksList;
		}
	

}
