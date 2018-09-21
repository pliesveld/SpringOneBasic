package com.customeEvent;

import org.springframework.context.ApplicationListener;

public class CustomeEventHandler implements ApplicationListener<CustomEvent> {

	@Override
	public void onApplicationEvent(CustomEvent customEvent) 
	{
		System.out.println(customEvent.toString());
	}

}
