package com.technocis.booksandauthor.Dao;

import java.util.List;

import com.technocis.booksandauthor.model.Books;

public interface BooksDao {
	public List<Books> getallBooks();
	public List<Books> InsertBook(Books authorid);
	

}
