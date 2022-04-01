package com.technocis.booksandauthor.Dao;

import java.util.List;

import com.technocis.booksandauthor.model.Author;


public interface AuthorDao {
	public List<Author> getallAuthor();
	public Author InsertBook(int Author);
	

}
