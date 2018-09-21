package com.required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RequiredAnnotation {

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/required/spring.xml");
		
		Message message = context.getBean("message",Message.class);
		
		System.out.println(message);
	}

}
