package com.lazyInit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Table
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/lazyInit/AppConfigXML.xml");
		Restaurant drink = (Restaurant)context.getBean("restaurant");
		drink.setWelcome("Welcome to Restaurant");
		drink.showWaiters();
		
		Restaurant drink2 = (Restaurant)context.getBean("restaurant");
		drink2.showWaiters();
		
	}
}
