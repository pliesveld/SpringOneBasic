package com.factoryMethodInjection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryMethodInjection
{
	public static void main(String[] args)
	{	
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/factoryMethodInjection/spring.xml");
		
		ATM atm = context.getBean("atm",ATM.class);
		atm.printBalanceInfo("abcds");
		
		
		
	}
}
