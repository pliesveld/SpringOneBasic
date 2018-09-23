package com.lazyInit;

public class Restaurant 
{
	String welcome;

	public void setWelcome(String welcome) {
		this.welcome = welcome;
	}
	
	public void showWaiters() 
	{
		System.out.println("Waiters = "+welcome);
	}
}
