package com.BeanAutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanAutoWiring {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/BeanAutoWiring/BeanAutoWiring.xml");
		Triangle triangle  = (Triangle) context.getBean("triangle");
		triangle.draw();
	}

}
