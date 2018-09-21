package com.customeEvent;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args)
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/customeEvent/spring.xml");
		
		CustomEventPublisher cep = context.getBean("customEventPublisher", CustomEventPublisher.class);
		
		cep.publishEvent();
		
		context.close();
	}

}
