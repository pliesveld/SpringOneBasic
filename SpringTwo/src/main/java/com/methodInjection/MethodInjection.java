package com.methodInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MethodInjection
{
	public static void main(String[] args)
	{	
		ApplicationContext context = new ClassPathXmlApplicationContext("com/methodInjection/spring.xml");
		
		TicketVendingMachine tvm = (TicketVendingMachine) context.getBean("tvm");
		
		Ticket ticket =(Ticket) tvm.generateTicket();
		
		System.out.println(ticket.printTicket());
		
	}
}
