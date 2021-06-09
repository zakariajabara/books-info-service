package io.jaba.tutorials.booksinfoservice.model;

public class Book {
	
	//later isbn, 
	private String bookId;
	
	private String name;

	public Book() {
	}
	public Book(String bookId, String name) {
		super();
		this.bookId = bookId;
		this.name = name;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
