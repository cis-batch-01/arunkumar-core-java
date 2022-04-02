package com.technocis.author.Dao;

import java.util.List;

import com.technocis.author.model.Book;

public interface BookDao {
	public List<Book> getAllBook();
	public Book getBook(String BookId);
	public Book insertbook(Book book);
	public Book updatebook(String bookId, Book book);
	public Book deletebook(String bookId);
	public List<Book> getAllBookList(String authorId);
	
	
	

}
