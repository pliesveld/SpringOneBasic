package com.bean.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Table
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bean/lifecycle/beanlifecycle.xml");
		
		((AbstractApplicationContext)context).registerShutdownHook();
		
		Restaurant drink = (Restaurant)context.getBean("restaurant");
		drink.display();
		
		
	}
	
}
