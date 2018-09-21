package com.beanPostProcessor;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

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
		System.out.println("message id : "+id+"\n"+"message :"+message);
	}
	
	public void destroy() throws Exception 
	{
		System.out.println("Before Bean Destroy");
	}
	
	public void init() throws Exception 
	{
		System.out.println(" Before Bean Initialization");
	}
}
