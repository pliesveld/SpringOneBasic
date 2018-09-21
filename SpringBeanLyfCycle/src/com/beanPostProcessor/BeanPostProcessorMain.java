package com.beanPostProcessor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanPostProcessorMain 
{
	public static void main(String[] args)
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/beanPostProcessor/spring.xml");
		Message message = context.getBean("message",Message.class);
		message.show();
		context.close();
	}
	
}
