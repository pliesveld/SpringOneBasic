package com.phone;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// @Primary if we want to make it primary to create object of
public class MediaTek implements Processor{

	@Override
	public void process() 
	{
		System.out.println("MediaTek processor");
	}

}
