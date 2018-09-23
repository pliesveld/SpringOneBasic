package com.ObjectInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ObjeectInjection {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ObjectInjection/ObjectInjection.xml");
		Triangle triangle  = (Triangle) context.getBean("triangle");
		triangle.draw();
	}

}
