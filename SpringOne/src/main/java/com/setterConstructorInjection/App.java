package com.setterConstructorInjection;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class App {

	public static void main(String[] args) 
	{
		//BeanFactory context = new XmlBeanFactory(new FileSystemResource("two.xml")); // We should keep spring.xml        		  in root folder if we use BeanFactory
		ApplicationContext context = new ClassPathXmlApplicationContext("com/setterConstructorInjection/setterConstructorInjection.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		Triangle triangle2 = (Triangle) context.getBean("triangle2");
		triangle2.draw();
		triangle.draw();
		
	}
}
