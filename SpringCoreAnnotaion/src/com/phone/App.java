package com.phone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
	public static void main(String[] args) 
	{
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfigurationXML.class);
		
		Samsung s = factory.getBean(Samsung.class);
		s.specification();
	}
}
