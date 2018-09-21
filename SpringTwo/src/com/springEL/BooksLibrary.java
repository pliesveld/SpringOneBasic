package com.springEL;

import java.util.List;

public class BooksLibrary {
	private List<Books> allBooks;
	private Books getFirstBook;
	
	public List<Books> getAllBooks() {
		return allBooks;
	}
	public void setAllBooks(List<Books> allBooks) {
		this.allBooks = allBooks;
	}
	
	
	public Books getGetFirstBook() {
		return getFirstBook;
	}
	public void setGetFirstBook(Books getFirstBook) {
		this.getFirstBook = getFirstBook;
	}
	
}
