package com.technocis.author.model;

import java.util.Date;
import java.util.List;

public class Book {
	private String bookId;
	private String title;
	private String description;
	private String publication;
	private Date publishedDate;
	private Double price;
	List<Author> author;
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public Date getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public List<Author> getAuthor() {
		return author;
	}
	public void setAuthor(List<Author> author) {
		this.author = author;
	}
	public Book(String bookId, String title, String description, String publication, Date publishedDate, Double price,
			List<Author> author) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.description = description;
		this.publication = publication;
		this.publishedDate = publishedDate;
		this.price = price;
		this.author = author;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "\nbookId=" + bookId + "\ntitle=" + title + "\ndescription=" + description + "\n publication="
				+ publication + "\n publishedDate=" + publishedDate + "\n price=" + price + "\n author=" + author + "\n";
	}

}
