package com.one;

import java.util.List;

public class Restaurant 
{
	private List waiters;

	public void setWaiters(List waiters) {
		this.waiters = waiters;
	}
	
	public void showWaiters() 
	{
		System.out.println("Waiters = "+waiters);
	}
}
