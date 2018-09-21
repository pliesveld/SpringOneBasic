package com.one;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Table
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/one/AppConfigXML.xml");
		Restaurant drink = (Restaurant)context.getBean("restaurant");
		drink.showWaiters();
		
	}
}
