package com.technocis.booksandauthor.model;

import java.sql.Date;
import java.util.List;

public class Author {
	private Integer Author_id;
	private String Name;
	private String Gender;
	private String description;
	private Date first_book_released_date;
	List<Books> books;
	public Integer getAuthor_id() {
		return Author_id;
	}
	public void setAuthor_id(Integer author_id) {
		Author_id = author_id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getFirst_book_released_date() {
		return first_book_released_date;
	}
	public void setFirst_book_released_date(Date first_book_released_date) {
		first_book_released_date = first_book_released_date;
	}
	public List<Books> getBooks() {
		return books;
	}
	public void setBooks(List<Books> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "\n Author_id=" + Author_id + "\n Name=" + Name + "\n Gender=" + Gender + "\n Description="
				+ description + "\n First_book_released_date=" + first_book_released_date + "\nBooks=" + books + "]";
	}
	public Author(Integer author_id, String name, String gender, String description, Date first_book_released_date,
			List<Books> books) {
		super();
		Author_id = author_id;
		Name = name;
		Gender = gender;
		this.description = description;
		first_book_released_date = first_book_released_date;
		this.books = books;
	}
	public Author(String name, String gender, String description, Date first_book_released_date, List<Books> books) {
		super();
		Name = name;
		Gender = gender;
		this.description = description;
		first_book_released_date = first_book_released_date;
		this.books = books;
	}
	public Author() {
		super();
		
	}
	
	

}
