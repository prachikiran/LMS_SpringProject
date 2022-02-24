package com.javaproject.springboot.design;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bookstack")
public class BookStack {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookID;
	@Column(name = "bookSubject")
	private String subject;
	@Column(name = "bookTitle")
	private String title;
	@Column(name = "bookAuthor")
	private String author;
	@Column(name = "bookPublisher")
	private String publisher;
	@Column(name = "bookEdition")
	private String edition;
	@Column(name = "bookPrice")
	private double price;
	@Column(name = "bookQuantity")
	private int quantity;

	public BookStack() {
		super();
	}

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "BookStack [BookID=" + bookID + ", Subject=" + subject + ", Title=" + title + ", Author=" + author
				+ ", Publisher=" + publisher + ", Edition=" + edition + ", MRP=" + price + ", Quantity=" + quantity
				+ "]";
	}
}
