package com.CollectionInitialization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionInitialization {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/CollectionInitialization/CollectionInitialization.xml");
		Triangle triangle  = (Triangle) context.getBean("triangle");
		triangle.draw();
	}

}
