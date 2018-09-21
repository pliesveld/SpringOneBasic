package com.InitDestroyAnnotaion;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Message
{
	private String id;
	private String message;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void show() 
	{
		System.out.println("message id : "+id+" message :"+message);
	}
	@PreDestroy
	public void destroy() throws Exception 
	{
		System.out.println("Before Bean Initialization");
	}
	@PostConstruct
	public void init() throws Exception 
	{
		System.out.println("Before Bean Destroy");
	}
}
