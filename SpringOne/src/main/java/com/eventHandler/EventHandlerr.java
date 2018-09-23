package com.eventHandler;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventHandlerr
{
	public static void main(String[] args)
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("com/eventHandler/spring.xml");
		context.start();
		
		Message message = context.getBean("message",Message.class);
		
		System.out.println("Object : "+message);
		message.show();
		
		context.stop();
		context.close();
	}
	
}
