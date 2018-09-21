package com.springEL;

import java.util.List;

public class BookCollection 
{
	private List<Books> booklist;

	public List<Books> getBooklist() {
		return booklist;
	}

	public void setBooklist(List<Books> booklist) {
		this.booklist = booklist;
	}
	
	public Books getFirstBook()
	{
		return getBooklist().get(0);
	}
}
