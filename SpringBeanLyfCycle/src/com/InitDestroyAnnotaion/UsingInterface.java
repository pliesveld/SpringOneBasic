package com.InitDestroyAnnotaion;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsingInterface 
{
	public static void main(String[] args)
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/InitDestroyAnnotaion/spring.xml");
		Message message = context.getBean("message",Message.class);
		message.show();
		context.close();
	}
	
}
