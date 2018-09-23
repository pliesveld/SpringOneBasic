package com.phone;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.phone")
public class AppConfigurationXML 
{
	//If we dont wanna use @Bean then we have to use @Component for every class for which we wan an object 
	// and we have to use @componentscan in Configuration file
	/*@Bean
	public Samsung getPhone()
	{
		return new Samsung();
	}
	@Bean
	public Processor getProcessor()
	{
		return new Snapdragone();
	}*/
}
