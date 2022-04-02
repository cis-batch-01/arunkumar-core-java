package com.technocis.author.Dao;

import java.util.List;

import com.technocis.author.model.Author;
import com.technocis.author.model.Book;

public interface AuthorDao {
	public List<Author> getAllAuthor();
	public Author getAuthor(String AuthorId);
	public Author insertAuthor(Author author);
	public Author updateAuthor(String AuthorId, Author author);
	public Author deleteAuthor(String authoId);
	public List<Author> getAllAuthorList(String bookId);

}
