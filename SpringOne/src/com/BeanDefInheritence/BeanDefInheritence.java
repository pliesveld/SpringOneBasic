package com.BeanDefInheritence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanDefInheritence {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/BeanDefInheritence/BeanDefInheritence.xml");
		Triangle triangle  = (Triangle) context.getBean("Parenttriangle");
		triangle.draw();
	}

}
