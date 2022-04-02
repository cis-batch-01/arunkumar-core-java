package com.technocis.author.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.technocis.author.ConnectionUtill.ConectionUtill;
import com.technocis.author.Dao.AuthorDao;
import com.technocis.author.Dao.BookDao;
import com.technocis.author.model.Author;
import com.technocis.author.model.Book;

public class AuthorDaoImpl implements AuthorDao {
		public static final String GETBYAUTHORID = "select Author.name,Author.description,Author.gender,Author.first_book_released_date FROM Author where author_id=?";
	public static final String SELECTALLAUTHORS = "select author_id,name,description,gender,first_book_released_date from Author";
	public static final String INSERTAUTHOR = "insert into Author (author_id,name,description,gender,first_book_released_date) values (?,?,?,?,?)";
	public static final String SELECTALLAUTHORBOOKS = "select Author.author_id,Author.name,Author.description,Author.gender,Author.first_book_released_date from books "
			+ "join book_author as ba on books.Book_id=ba.Book_id " + "join Author on ba.Author_id=Author.author_id "
			+ " where books.book_id=?";
	
	
	public List<Author> getAllAuthor() {
		List<Author> authorList = new ArrayList<Author>();
		BookDao bookDao = new BookDaoImpl();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = ConectionUtill.getDbConnection();
			pstmt = con.prepareStatement(SELECTALLAUTHORS);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				authorList.add(new Author(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), bookDao.getAllBookList(rs.getString(1))));
			}


		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return authorList;
	}

	public Author getAuthor(String AuthorId) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Author author = null;
		try {
			con = ConectionUtill.getDbConnection();
			pstmt = con.prepareStatement(GETBYAUTHORID);
			pstmt.setString(1, AuthorId);;
			rs = pstmt.executeQuery();
			if (rs.next()) 
				author = new Author(AuthorId,rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), null);
			

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return author;
	}

		
		
	

	public Author insertAuthor(Author author) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConectionUtill.getDbConnection();
			pstmt = con.prepareStatement(INSERTAUTHOR);
			pstmt.setString(1, author.getAuthorid());
			pstmt.setString(2, author.getName());
			pstmt.setString(3, author.getDescription());
			pstmt.setString(4, author.getGender());
			pstmt.setDate(5, new java.sql.Date(author.getFirstbookreleaseddate().getTime()));
			int rowsAffected = pstmt.executeUpdate();
			if (rowsAffected > 0) {
				return author;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	

	public Author updateAuthor(String AuthorId, Author author) {
		
		return null;
	}

	public Author deleteAuthor(String authoId) {
		
		return null;
	}

	public List<Author> getAllAuthorList(String bookId) {
		List<Author> authorsList = new ArrayList<Author>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = ConectionUtill.getDbConnection();
			pstmt = con.prepareStatement(SELECTALLAUTHORBOOKS);
			pstmt.setString(1, bookId);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				authorsList.add(new Author(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getDate(5), null));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return authorsList;
	}

}
