package com.technocis.booksandauthor.model;

import java.util.Date;
import java.util.List;

public class Books {
	private String book_id;
	private String Title;
	private String description;
	private String pulication;
	private Date publisheddate;
	private Double price;
	List<Author> authors;
	
	
	public String getBook_id() {
		return book_id;
	}
	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPulication() {
		return pulication;
	}
	public void setPulication(String pulication) {
		this.pulication = pulication;
	}
	public Date getPublisheddate() {
		return publisheddate;
	}
	public void setPublisheddate(Date publisheddate) {
		this.publisheddate = publisheddate;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	
	
	
	@Override
	public String toString() {
		return "\n Book_id=" + book_id + "\n Title=" + Title + "\n Description=" + description + "\n Pulication="
				+ pulication + "\nPublisheddate=" + publisheddate + "\nPrice=" + price + "\nAuthors=" + authors + "]";
	}
	
	
	public Books(String book_id, String title, String description, String pulication, Date publisheddate, Double price,
			List<Author> authors) {
		super();
		this.book_id = book_id;
		Title = title;
		this.description = description;
		this.pulication = pulication;
		this.publisheddate = publisheddate;
		this.price = price;
		this.authors = authors;
	}
	public Books() {
		super();
			}

}
