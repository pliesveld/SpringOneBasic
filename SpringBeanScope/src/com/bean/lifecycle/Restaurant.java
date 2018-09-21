package com.bean.lifecycle;

/*import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;*/

public class Restaurant 
{
	
	public void display() 
	{
		System.out.println("Welcome to Bean Life Cycle");
	}
	
	/*@PostConstruct*/
	public void init()
	{
		System.out.println("Bean init method gets call");
	}
	/*@PreDestroy*/
	public void destroy() 
	{
		System.out.println("Bean Destroy method gets call");
	}
}
