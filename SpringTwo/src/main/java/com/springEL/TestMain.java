package com.springEL;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springEL/spring.xml");
		BooksLibrary booksLibrary  = context.getBean("booksLibrary",BooksLibrary.class);
		List<Books> allbooks = booksLibrary.getAllBooks();
		
		for (Books books : allbooks)
		{
			System.out.println(books.getBookId()+"  \t  "+ books.getBookName());
		}
		
		Books book = booksLibrary.getGetFirstBook();
		System.out.println(book.getBookId()+"  \t  "+ book.getBookName());
	}

}
