package com.technocis.author.model;

import java.util.Date;
import java.util.List;

public class Author {
	private String authorid;
	private String name;
	private String gender;
	private String description;
	private Date firstbookreleaseddate;
	List<Book> books;
	public String getAuthorid() {
		return authorid;
	}
	public void setAuthorid(String authorid) {
		this.authorid = authorid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getFirstbookreleaseddate() {
		return firstbookreleaseddate;
	}
	public void setFirstbookreleaseddate(Date firstbookreleaseddate) {
		this.firstbookreleaseddate = firstbookreleaseddate;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public Author(String authorid, String name, String gender, String description, Date firstbookreleaseddate,
			List<Book> books) {
		super();
		this.authorid = authorid;
		this.name = name;
		this.gender = gender;
		this.description = description;
		this.firstbookreleaseddate = firstbookreleaseddate;
		this.books = books;
	}
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "\n authorid=" + authorid + "\n name=" + name + "\n gender=" + gender + "\n description=" + description
				+ "\n firstbookreleaseddate=" + firstbookreleaseddate + "\n books=" + books + "]";
	}
	

}
