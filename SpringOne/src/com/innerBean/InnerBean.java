package com.innerBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InnerBean {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/innerBean/InnerBean.xml");
		Triangle triangle  = (Triangle) context.getBean("triangle");
		
		triangle.draw();
	}

}
