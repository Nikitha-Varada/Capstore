package com.cg.lm.entity;
public class Book 
{
	int book_id;
	String title;
	String author;
	String publisher;
	double price;
	int pages;
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public Book(int book_id, String title, String author, String publisher, double price, int pages) {
		super();
		this.book_id = book_id;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.pages = pages;
	}
	public Book() {
	}
	

}
