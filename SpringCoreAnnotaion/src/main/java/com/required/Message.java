package com.required;

import org.springframework.beans.factory.annotation.Required;

public class Message 
{
	private String id;
	private String msg;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMsg() {
		return msg;
	}
	@Required
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", msg=" + msg + "]";
	}
	
}
