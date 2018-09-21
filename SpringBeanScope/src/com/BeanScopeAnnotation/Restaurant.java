package com.BeanScopeAnnotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("rest")
@Scope("prototype")
public class Restaurant 
{
	String welcome;
	int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWelcome() {
		return welcome;
	}

	

	public void setWelcome(String welcome) {
		this.welcome = welcome;
	}
	
	public void showWaiters() 
	{
		System.out.println("welcome Waiters "+welcome+" with Id "+id);
	}
}
