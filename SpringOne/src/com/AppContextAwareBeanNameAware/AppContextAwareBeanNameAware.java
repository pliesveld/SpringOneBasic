package com.AppContextAwareBeanNameAware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppContextAwareBeanNameAware {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/AppContextAwareBeanNameAware/AppContextAwareBeanNameAware.xml");
		Triangle triangle  = (Triangle) context.getBean("triangle");
		triangle.draw();
	}

}
