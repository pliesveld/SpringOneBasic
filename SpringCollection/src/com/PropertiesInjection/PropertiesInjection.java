package com.PropertiesInjection;

import java.util.*;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class PropertiesInjection
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/PropertiesInjection/PropertiesInjection.xml");
		Student student = context.getBean("student",Student.class);
		System.out.println(student);
		
		Properties prop = student.getStud();
		
		Set<Entry<Object, Object>> set = prop.entrySet();
		for (Entry<Object, Object> entry : set) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}
}
