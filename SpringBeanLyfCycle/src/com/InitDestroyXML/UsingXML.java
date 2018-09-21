package com.InitDestroyXML;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsingXML
{
	public static void main(String[] args)
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/InitDestroyXML/spring.xml");
		Message message = context.getBean("message",Message.class);
		message.show();
		context.close();
	}
	
}
