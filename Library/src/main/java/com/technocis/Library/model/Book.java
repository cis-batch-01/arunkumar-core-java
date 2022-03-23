package com.technocis.Library.model;

import java.util.Date;

public class Book {
private Integer id;
private String Name;
private String description;
private String publisherName;
private Date publihDate;
private Double price;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getPublisherName() {
	return publisherName;
}
public void setPublisherName(String publisherName) {
	this.publisherName = publisherName;
}
public Date getPublihDate() {
	return publihDate;
}
public void setPublihDate(Date publihDate) {
	this.publihDate = publihDate;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public Book(Integer id, String name, String description, String publisherName, Date publihDate, Double price) {
	super();
	this.id = id;
	Name = name;
	this.description = description;
	this.publisherName = publisherName;
	this.publihDate = publihDate;
	this.price = price;
}
public Book(String name, String description, String publisherName, Date publihDate, Double price) {
	super();
	Name = name;
	this.description = description;
	this.publisherName = publisherName;
	this.publihDate = publihDate;
	this.price = price;
}
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Book [id=" + id + ", Name=" + Name + ", description=" + description + ", publisherName=" + publisherName
			+ ", publihDate=" + publihDate + ", price=" + price + "]";
}




}
