package com.pNamespace;

import java.util.*;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class PNameSpace
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/pNamespace/spring.xml");
		Student student = context.getBean("student",Student.class);
		
		System.out.println(student);
		
	}
}
