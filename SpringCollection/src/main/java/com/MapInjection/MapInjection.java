package com.MapInjection;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapInjection
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/MapInjection/MapInjection.xml");
		StudentMain studentmain = context.getBean("studentmain",StudentMain.class);
		System.out.println(studentmain);
		
	}
}
