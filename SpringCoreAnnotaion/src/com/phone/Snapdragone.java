package com.phone;

import org.springframework.stereotype.Component;

@Component
public class Snapdragone implements Processor
{

	@Override
	public void process() 
	{
		System.out.println("Snapdragon CPU");
	}

}
