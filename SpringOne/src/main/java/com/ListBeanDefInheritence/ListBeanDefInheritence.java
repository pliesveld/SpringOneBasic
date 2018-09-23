package com.ListBeanDefInheritence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListBeanDefInheritence {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ListBeanDefInheritence/ListBeanDefInheritence.xml");
		Triangle triangle  = (Triangle) context.getBean("triangle1");
		triangle.draw();
	}

}
