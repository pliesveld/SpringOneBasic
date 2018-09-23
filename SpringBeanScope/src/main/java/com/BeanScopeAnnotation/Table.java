package com.BeanScopeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Table
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/BeanScopeAnnotation/AppConfigXML.xml");
		Restaurant drink = (Restaurant)context.getBean("rest",Restaurant.class);
		drink.setWelcome("Buttler");
		drink.setId(4);
		drink.showWaiters();
		
		Restaurant drink2 = (Restaurant)context.getBean("rest",Restaurant.class);
		drink2.showWaiters();
		
	}
}
