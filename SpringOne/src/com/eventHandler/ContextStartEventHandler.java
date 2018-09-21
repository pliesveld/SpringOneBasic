package com.eventHandler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class ContextStartEventHandler implements ApplicationListener<ContextStartedEvent> {

	@Override
	public void onApplicationEvent(ContextStartedEvent cse) {
		
		System.out.println("Context Started Event");
		System.out.println(cse.getSource());
		System.out.println("-----------------------------------------");
	}

}
